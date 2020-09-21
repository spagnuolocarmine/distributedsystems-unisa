# Architetture Distribuite per il Cloud (ADC) 🐌 Università degli Studi di Salerno - Class 2020/2021


### Referents
- Prof. Alberto Negro (Fundamentals and Algorithms for Distributed Systems).
- Prof. Gennaro Cordasco  (Peer-to-Peer Networks).
- Ph.D. Carmine Spagnuolo (Laboratory).

### Labs organization

- Join our Discord ISISLab' community to be supported in your homework.
  -   [![w:300](https://img.shields.io/badge/Discord-%23adc-7289da.svg?style=flat-square&logo=discord)](https://discord.gg/BTt5fUp) (classes category).
  -   When you enter in our server, please write to Carmine Spagnuolo for asking a Master Student role (this will ensure you to access to the channels, is required).
- **Calendar:**
  - 📅 29/09/2020 Virtualization technologies: Containers and Docker 🐋 
  - 📅 06/10/2020 Peer-to-peer technologies: TomP2P, a P2P-based key-value pair storage library
  - 📅 13/10/2020 Homework presentation, and development technologies (Maven and GitHub).
  - 📅 27/09/2020 We will meet in ```#adc``` channel each Tuesday (14:00-16:00) for discussions about the homework development.


##  Homework

### Design your solution

Projects must be developed using Java languages (also, using [Apache Maven](https://maven.apache.org/) as software project management) and [TomP2P](https://tomp2p.net/) framework/library.
TomP2P is a DHT with additional features, such as storing multiple values for a key. Each peer has a table (either disk-based or memory-based) to keep its values. A single value can be queried/updated with a secondary key. The underlying communication framework uses Java NIO to handle many concurrent connections.

### Prerequisites

- Concurrent and Object-oriented programming fundamentals (Threads and Observer patterns are required).
- Distributed System fundamental (Distributed Hash Tables, DHT is required).
- Java 7 or greater.
- Apache Maven.
- Eclipse (optional).

### Evaluation criteria

Homework are evaluated on a range of 30 total points. The final score is diveded in four level:

- **A** [30-28]
- **B** [27-25]
- **C** [24-22]
- **D** [21-18]

#### Scores

- **Correctness**. 0 to 10 points. It measures the group's commitment to developing a compliant solution with the problem requirement (obviously!). But also a solution that solves part of the problem can be evaluated if it is clear that only a minor part of the problem is not correctly solved.
- **Style**. 0 to 5 points. It measures the group's commitment to developing a solution, styling it, and exploiting all TomP2P and Java 7 or greater features, paying attention to using the fundamental part and DHT arguments.
- **Innovation**. 0 to 5 points. It measures the group's commitment to developing additional features to provide more similar applications to real ones.
- **Dockerization**. 0 to 5 points. It measures the group's commitment to dockerizing the application (converting the application solution to run within a Docker container). Will be evaluated the application usability and the Docker features exploited.
- **Tools**. 0 to 5 points. Correct use of Maven and JUnit.
- **Lateness**. The total score is decreased by 5% each day, until 40% eight days or more late. The delay time will be computed starting from the date **official exam date**.

### Homework list

Each homework is presented with a Java interface API that must be implemented by a solution (the API is available in the folder challenges).

Five projects to be developed on a P2P Network:

- *Publish/Subscribe Protocol* ([example project](https://github.com/spagnuolocarmine/p2ppublishsubscribe))
- *Anonymous Chat*
- *Git Protocol*
- *Auction Mechanism*
- *Sudoku Game*
- *Semantics Harmony Social Network*

Each project must also be deployed on a Docker container that allows the users to execute the application peer quickly. The application parameters can be easily managed using the Docker environment variables. The project **must** provide a command-line interface that exploits all functionalities developed and tested.

```
$ docker run -i -e MASTERIP="127.0.0.1" -e ID=0 homework-docker --name MASTER-PEER
$ docker run -i -e MASTERIP="172.17.0.2" -e ID=1 homework-docker --name GENERIC-PEER
```

### Homework Descriptions

#### 1 Anonymous Chat

<img align="right" src=https://s3.amazonaws.com/lowres.cartoonstock.com/telecommunications-chatting-chatroom-chatting_over_the_fence-neighbour-gossip-gri0032_low.jpg width="300"/>

Design and develop an anonymous chat API based on P2P Network. Each peer can send messages on a public chat room in an anonymous way. The system allows the users to create a new room, join in a room, leave a room, and send messages. As described in the [AnonymousChat Java API](https://github.com/spagnuolocarmine/distributedsystems/blob/master/challenges/AnonymousChat.java).

&nbsp;

&nbsp;

&nbsp;

&nbsp;

&nbsp;

&nbsp;

&nbsp;

### 2 Git Protocol

<img align="left" src= https://i2.wp.com/makingbones.files.wordpress.com/2013/02/picture12.jpg width="300"/>

Design and develop the Git protocol, distributed versioning control on a P2P network. Each peer can manage its projects (a set of files) using the Git protocol (a minimal version). The system allows the users to create a new repository in a specific folder, add new files to be tracked by the system, apply the changing on the local repository (commit function), push the network's changes, and pull the changing from the network. The git protocol has lot-specific behavior to manage the conflicts; in this version, it is only required that if there are some conflicts, the systems can download the remote copy, and the merge is manually done. As described in the [GitProtocol Java API](https://github.com/spagnuolocarmine/distributedsystems/blob/master/challenges/GitProtocol.java).

&nbsp;

&nbsp;

&nbsp;

&nbsp;


#### 3 Auction Mechanism

<img align="right" src =https://s3.amazonaws.com/lowres.cartoonstock.com/law-order-online_auction-blackmarket-black_market-website-stolen_good-bmun149_low.jpg width="300"/>

Design and develop an auction mechanism based on P2P Network. Each peer can sell and buy goods using second-price Auctions (eBay). 
Second-price auction is a non-truthful auction mechanism for multiple items. Each bidder places a bid. The highest bidder gets the first slot, the second-highest, the second slot, and so on, but the highest bidder pays the price bid by the second-highest bidder, the second-highest pays the price bid by the third-highest, and so on. The systems allow the users to create new auction (with an ending time, a reserved selling price, and a description), check the status of an auction, and eventually place a new bid for an auction. As described in the [AuctionMechanism Java API](https://github.com/spagnuolocarmine/distributedsystems/blob/master/challenges/AuctionMechanism.java).


&nbsp;

&nbsp;

&nbsp;


#### 4 Sudoku Game

<img align="left" src =https://upload.wikimedia.org/wikipedia/commons/thumb/f/ff/Sudoku-by-L2G-20050714.svg/220px-Sudoku-by-L2G-20050714.svg.png  width="300"/>

Design and develop a Sudoku challenge game on a P2P network. Each user can place a number of the sudoku game; if it is not already placed takes 1 point, if it is already placed and it is rights take 0 points, in other case receive -1 point. The games are based on a 9 x 9 matrix. All users that play to a game are automatically informed when a user increment its score and when
the game is finished. The system allows the users to generate (automatically) a new Sudoku challenge identified by a name, join in a challenge using a nickname, get the integer matrix describing the Sudoku challenge, and place a solution number. As described in the [SudokuGame Java API](https://github.com/spagnuolocarmine/distributedsystems/blob/master/challenges/SudokuGame.java).


&nbsp;

&nbsp;

&nbsp;


#### 5 Semantic Harmony Social Network

<img align="right" src= https://s3.amazonaws.com/lowres.cartoonstock.com/media-social_media-interests-compatibility-dates-social_networks-jsh120327_low.jpg  width="300"/>

Design and develop a social network based on the user's interests that exploits a P2P Network. The system collects the profiles of the users and automatically creates friendships according to a matching strategy. The users can see their friends over time and are automatically informed when a user enters the social network and becomes a new potential friend. The system defines a set of questions, for instance, if the user like or not like a set of photos, a set of a hashtag, or more accurate as Big Five Personality Test. At this point, the system can compute the user scoring according to the answers. This scoring is elaborated by a matching strategy that automatically finds out the friends. Consider, for instance, a binary answers vector; a matching process should be the difference in 0 and 1, or the Hamming distance, and so on. The system allows the users to see the social network questions, create a profile score according to the answer, join in the network using a nickname, and eventually see all user friends. As described in the [SemanticHarmonySocialNetwork Java API](https://github.com/spagnuolocarmine/distributedsystems/blob/master/challenges/SemanticHarmonySocialNetwork.java).

&nbsp;

&nbsp;

&nbsp;


---------------------------------------------------------------------------------------------------


### Develop your solution (Java dependencies) 

Using Maven, you can add the dependencies to TomP2P in the pom.xml file. 

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


### Give me Homework now!
 
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


## ⚠️ Homework Submission 

- Submission Process ⬇️
    - 🗄️ Create a new repository on your GitHub profile.
      - ```repository_name``` = ```name_surname_adc_2020```
    - 📝 Design your repository using the same project's structure of [example project](https://github.com/spagnuolocarmine/p2ppublishsubscribe).
    - 📘 ```README.md``` must contain a description of your repository and your solution (will be evaluated).
    - 📧 Send a mail to cspagnuolo+ADC2020@unisa.it before the exam date (official ESSE3) and writing in the object's mail your name and the exam date (e.g., Alice Wonderland 01/01/2021). **Please be sure that you follow this instruction**

### Homework TIPS 🎳

Solutions must be a Java Maven project that implements the problem API and includes, at minimum, one test case written using JUnit (unit test case for Java). Each project must consist of a README file, written in Markdown, in the project's root. The README describes the faced project, briefly the project members' solution, and eventually test cases.

The _test case_ must instantiate the network (with a minimum of four peers) and simulates all operations described in the problem description. Solutions that fail the test cases or do not test all features are considered NOT CORRECT and are evaluated, considering that they cannot have the maximum score. 

