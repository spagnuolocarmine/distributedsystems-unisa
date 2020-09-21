package it.isislab.examples;

import java.io.IOException;
import java.net.InetAddress;

import net.tomp2p.dht.FutureGet;
import net.tomp2p.dht.PeerBuilderDHT;
import net.tomp2p.dht.PeerDHT;
import net.tomp2p.futures.FutureBootstrap;
import net.tomp2p.p2p.PeerBuilder;
import net.tomp2p.peers.Number160;
import net.tomp2p.storage.Data;

/**
 * See http://tomp2p.net/doc/quick/ for more information on this
 * 
 * Source: https://github.com/tomp2p/TomP2P/blob/master/examples/src/main/java/net/tomp2p/examples/ExampleDNS.java
 */
public class ExampleDNS {
	final private PeerDHT peer;

	public ExampleDNS(int nodeId) throws Exception {
		peer = new PeerBuilderDHT(new PeerBuilder(Number160.createHash(nodeId)).ports(4000 + nodeId).start()).start();
		FutureBootstrap fb = this.peer.peer().bootstrap().inetAddress(InetAddress.getByName("127.0.0.1")).ports(4001).start();
		fb.awaitUninterruptibly();
		if(fb.isSuccess()) {
			peer.peer().discover().peerAddress(fb.bootstrapTo().iterator().next()).start().awaitUninterruptibly();
		}
	}

	public static void main(String[] args) throws NumberFormatException, Exception {
		ExampleDNS dns = new ExampleDNS(1);
		ExampleDNS client = new ExampleDNS(2);
		dns.store("www.isislab.it", "193.205.160.1");
		System.out.println("Name: www.isislab.it IP:" + client.get("www.isislab.it"));
		System.exit(0);
	}

	private String get(String name) throws ClassNotFoundException, IOException {
		FutureGet futureGet = peer.get(Number160.createHash(name)).start();
		futureGet.awaitUninterruptibly();
		if (futureGet.isSuccess()) {
			return futureGet.dataMap().values().iterator().next().object().toString();
		}
		return "not found";
	}

	private void store(String name, String ip) throws IOException {
		peer.put(Number160.createHash(name)).data(new Data(ip)).start().awaitUninterruptibly();
	}
}
