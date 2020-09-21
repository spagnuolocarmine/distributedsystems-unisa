# Distributed Systems Coursework University of Salerno

This is coursework of Distributed System class of Computer Science @ University of Salerno of Professor Alberto Negro.


#### Referents
- Prof. Alberto Negro (Foundamentals and Algorithms for Distributed Systems).
- Prof. Gennaro Cordasco and Ph.D. Carmine Spagnuolo (Peer-to-Peer Networks).

## Homeworks Solution Design Requirements

Projects must be developed using Java languages (also, using [Apache Maven](https://maven.apache.org/) as software project management) and [TomP2P](https://tomp2p.net/) framework/library.
TomP2P is a DHT with additional features, such as storing multiple values for a key. Each peer has a table (either disk-based or memory-based) to store its values. A single value can be queried / updated with a secondary key. The underlying communication framework uses Java NIO to handle many concurrent connections.

## Homeworks Prerequisites

- Concurrent and Object-oriented programming fundamental (Threads and Observer pattern are required).
- Distributed System foundamental (Distributed Hash Tables, DHT is required).
- Java 7 or greater.
- Apache Maven.
- Eclipse (optional).

## Homework Evaluation Criteria

Homeworks are evaluated on a range of 30 total points. The final score is diveded in four level:

- **A** [30-28]
- **B** [27-25]
- **C** [24-22]
- **D** [21-18]

#### Points

- **Correctness**. 0 to 10 points. Measures the group's commitment to develop a solution that is compliant with the problem requirement (obviously!). But also solution that solve part of the problem can be evaluated, if it is clear that only minor part of the problem are not correctly solved.
- **Style**. 0 to 5 points. Measures the group's commitment to develop a solution styling it and exploiting all features of TomP2P and Java 7 or greater, paying attention to use arguments of the fundamental part and DHT.
- **Innovation**. 0 to 5 points. Measures the group's commitment to develop additional features to provide application that are more similar to real ones.
- **Dockerization**. 0 to 5 points. Measures the group's commitment in dockerizing the application (the process of converting the application solution to run within a Docker container). Will be evaluated the application usability and the Docker features exploited.
- **Tools**. 0 to 5 points. Correct use of Maven and JUnit.
- **Lateness**. The total score is decreased by 5% each day, until a 40% eight days or more late. The delay time will be computed starting from the date official exame date.

## Homeworks

For each homework is presented a Java interface API that must be implemented by a solution (the API are available in the folder challenges).

Five projects to be developed on a P2P Network:

- *Publish/Subscribe Protocol* ([example project](https://github.com/spagnuolocarmine/p2ppublishsubscribe))
- *Anonymous Chat*
- *Git Protocol*
- *Auction Mechanism*
- *Sudoku Game*
- *Semantich Harmony Social Network*

Each project must be deployed also on a Docker container, that allows the users to easily execute the application peer. The application parameters can be easily managed using the Docker environment variables. The project **must** provide a command line interface, that enables to exploit all functionalities developed and tested.

```
$ docker run -i -e MASTERIP="127.0.0.1" -e ID=0 homework-docker --name MASTER-PEER
$ docker run -i -e MASTERIP="172.17.0.2" -e ID=1 homework-docker --name GENERIC-PEER
```

## Homeworks Descriptions

### 1 Anonymous Chat

<img align="right" src=https://s3.amazonaws.com/lowres.cartoonstock.com/telecommunications-chatting-chatroom-chatting_over_the_fence-neighbour-gossip-gri0032_low.jpg width="300"/>

Design and develop an anonymous chat API based on P2P Network. Each peer can send messages on public chat room in anonymous way. The system allows the users to create new room, join in a room, leave a room and send a message on a room. As described in the [AnonymousChat Java API](https://github.com/spagnuolocarmine/distributedsystems/blob/master/challenges/AnonymousChat.java).

&nbsp;

&nbsp;

&nbsp;

&nbsp;

&nbsp;

&nbsp;

&nbsp;

### 2 Git Protocol

<img align="left" src= https://i2.wp.com/makingbones.files.wordpress.com/2013/02/picture12.jpg width="300"/>

Design and develop the Git protocol distributed versioning control on a P2P network. Each peer can manage its projects (a set of files) using the Git protocol (a minimal version of it). The system allows the users to create a new repository in a specific folder, add new files to be tracked by the system, apply the changing on the local repository (commit function), push the changing in the network and pull the changing from the network. The git protocol has a lot specific behaviors to manage the conflicts, in this version it is only required that if there are some conflicts the systems can download the remote copy and the merge is manually done. As described in the [GitProtocol Java API](https://github.com/spagnuolocarmine/distributedsystems/blob/master/challenges/GitProtocol.java).

&nbsp;

&nbsp;

&nbsp;

&nbsp;


### 3 Auction Mechanism

<img align="right" src =https://s3.amazonaws.com/lowres.cartoonstock.com/law-order-online_auction-blackmarket-black_market-website-stolen_good-bmun149_low.jpg width="300"/>

Design and develop an auction mechanism based on P2P Network. Each peer can sell and buy goods using a Second-Price Auctions (EBay). 
second-price auction is a non-truthful auction mechanism for multiple items. Each bidder places a bid. The highest bidder gets the first slot, the second-highest, the second slot and so on, but the highest 
bidder pays the price bid by the second-highest bidder, the second-highest pays the price bid by the third-highest, and so on. The systems allows the users to create new auction (with an ending time, a reserved selling price and a description), check the status of an auction, and eventually place new bid for an auction. As described in the [AuctionMechanism Java API](https://github.com/spagnuolocarmine/distributedsystems/blob/master/challenges/AuctionMechanism.java).


&nbsp;

&nbsp;

&nbsp;


### 4 Sudoku Game

<img align="left" src =https://upload.wikimedia.org/wikipedia/commons/thumb/f/ff/Sudoku-by-L2G-20050714.svg/220px-Sudoku-by-L2G-20050714.svg.png  width="300"/>

Design and develop a Sudoku challenge game on a P2P network. Each user can place a number of the sudoku game, if it is not already placed takes 1 point, if it is already placed and it is rights takes 0 point, in other case receive -1 point. The games is based on 9 x 9 matrix. All users that play to a game are automatically informed when a user increment its score, and when
the game is finished. The system allows the users to generate (automatically) a new Sudoku challange identified by a name, join in a challenge using a nickname, get the integer matrix describing the Sudoku challenge, and place a solution number. As described in the [SudokuGame Java API](https://github.com/spagnuolocarmine/distributedsystems/blob/master/challenges/SudokuGame.java).


&nbsp;

&nbsp;

&nbsp;


### 5 Semantic Harmony Social Network

<img align="right" src= https://s3.amazonaws.com/lowres.cartoonstock.com/media-social_media-interests-compatibility-dates-social_networks-jsh120327_low.jpg  width="300"/>

Design and develop a social Network based on the users interests that exploits a P2P Network. The system collects the profiles of the users, and automatically creates friendships according to a matching startegy. The users can see its friends over the time and are automatically informed when a user enter in the social network and became a new potential friend. The system defines a set of questions, for instance if the user like or not like a set of photos, a set of hashtag, or more accurate as Big Five Personality Test. At this point the system can computes the user scoring according the answers. This scoring is elaborated by a matching strategy that automatically find out the friends. Consider for instance, a binary answers vector, a matching strategy should be the different in 0 and 1, or the Hamming distance  and so on. The system allows the users to see the social network questions, create a profile score according the answer, join in the network using a nickname and eventually see all user friends. As described in the [SemanticHarmonySocialNetwork Java API](https://github.com/spagnuolocarmine/distributedsystems/blob/master/challenges/SemanticHarmonySocialNetwork.java).

&nbsp;

&nbsp;

&nbsp;


---------------------------------------------------------------------------------------------------


#### Homework Development Java Dependences 

Usign Maven you can add the dependencies to TomP2P in the pom.xml file. 

```
<repositories>
    <repository>
        <id>tomp2p.net</id>
         <url>http://tomp2p.net/dev/mvn/</url>
     </repository>
</repositories>
<dependencies>
   <dependency>
     <groupId>net.tomp2p</groupId>
     <artifactId>tomp2p-all</artifactId>
      <version>5.0-Beta8</version>
   </dependency>
</dependencies>
```


### Give me an Homework now!
 
Compute the MD5 of your carminespagnuolo,namesurname ```md5(namesurname)```:

- the first character in the MD5 is the homework.

Characters table conversion (use case insentive):

| Character |Value|
|---|---|
|a-g-m-s-y-f-4|1|
|b-h-n-t-z-l-5|2|
|c-i-o-u-r-0-6|3|
|d-j-p-v-x-1-7|4|
|e-k-q-w-3-2-8-9|5|

**Example**  Team Wonderland, team member Alice your assignment is _wonderlandalice_, ```md5(wonderlandalice)=6b765adf84f3c4341e8aab77ceda3bf1```, that is solve the _Auction Mechanism_.


## Homework Submission

Each must register on: https://forms.gle/Ryjh8DwBGw5K8ptr7

- Submission Process
    - Create a new zip file containing the root directory of the Maven project.
    - Send it via mail (or other) to cspagnuolo@unisa.it, using subject ADC2019-NAME-SURNAME.
    - Enter the exam data is strongly REQUIRED.

Solutions must be as Java Maven project, that implements the problem API, and includes at minimum one test case written using JUnit (unit test case for Java). Each project must include a README file, written in markdown, in the root of the project. The README describes the faced project, briefly the solution, the projects members, and eventually test cases.
The testcase must instantiate the Network (with at minimum 4 peers) and simulates all operations described in the problem descricption. Solutions that fails the testcases, or does not test all features, is cosidered NOT CORRECT and is evaluated cosidering that cannot have the maxiumum score. Add a README.md file that describes the homework solution according to the score metrics.

