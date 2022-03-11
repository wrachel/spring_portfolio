## PrimitiveApes README

### GitHub Contributors: Calvin Cheah, Rachel Wei, Harry Li, Yajat Yadav, Devam Shrivastava

### Scrum Team Members and Contributions
##### [Scrum Board](https://github.com/wrachel/PrimitiveApes/projects/2) 
##### [Github Pages](https://wrachel.github.io/PrimitiveApes/)
##### [Repo Contributors](https://github.com/wrachel/PrimitiveApes/graphs/contributors) 

| Name            | GitHub ID | Tasks | Scrum Board | Commits | Profile | Individual Repl.it |
| --------------- | --------- | ----- | ----------- | ------- | ------- | ------------------ |
Devam Shrivastava (Design Manager) | devamshri | [Issues](https://github.com/wrachel/PrimitiveApes/projects/2?card_filter_query=assignee%3Adevamshri) | [Scrum Board](https://github.com/wrachel/PrimitiveApes/projects/2?card_filter_query=assignee%3Adevamshri) | [Commit Page](https://github.com/wrachel/PrimitiveApes/commits?author=devamshri)| [Profile](https://github.com/devamshri) | [Repl](https://replit.com/@D3vIs4G0d/Tri3DevamChallenges) & [INDIVIDUAL GITHUB PAGES](https://github.com/devamshri/Tri_3_Devam_Challenges/) |
Calvin (Github Admin) | QwikSP | [Issues](https://github.com/wrachel/PrimitiveApes/projects/2?card_filter_query=assignee%3Aqwiksp) | [Scrum Board](https://github.com/yajatyadav/intellijs/projects/1?card_filter_query=assignee%3A1855387) | [Commit Page](https://github.com/wrachel/PrimitiveApes/commits?author=QwikSP) | [Profile](https://github.com/QwikSP) | [Repl](https://replit.com/github/QwikSP/CSA-Tri-3) |
Yajat Yadav (Technical Officer) | yajatyadav | [Issues](https://github.com/wrachel/PrimitiveApes/labels/Yajat%20Yadav) | [Scrum Board](https://github.com/wrachel/PrimitiveApes/projects/2?card_filter_query=assignee%3Ayajatyadav) | [Commit Page](https://github.com/wrachel/PrimitiveApes/commits?author=yajatyadav) | [Profile](https://github.com/yajatyadav) | [Add Repl]() |
Rachel Wei (Scrum Master) | wrachel | [Issues](https://github.com/wrachel/PrimitiveApes/issues?q=assignee%3Awrachel) | [Scrum Board](https://github.com/wrachel/PrimitiveApes/projects/2?card_filter_query=assignee%3Awrachel) | [Commit Page](https://github.com/wrachel/PrimitiveApes/commits?author=wrachel) | [Profile](https://github.com/wrachel/PrimitiveApes/commits?author=wrachel) | [INDIVIDUAL Repl](https://replit.com/@RachelWei1/Data-Structures-Indiv#Main.java) & [INDIVIDUAL GITHUB PAGES](https://wrachel.github.io/tri3Individual/) |
Harry Li (Deployment Manager) | wiz124 | [Issues](https://github.com/yajatyadav/intellijs/issues/assigned/macddmac) | [Scrum Board](https://github.com/yajatyadav/intellijs/projects/1?card_filter_query=assignee%3Amacddmac) | [Commmits](https://github.com/yajatyadav/intellijs/commits?author=wiz124) | [Profile](https://github.com/wiz124) | [Repl](https://replit.com/@HarryLi11/individual#.replit)[jekyll](https://wiz124.github.io/individual/) |


## Ideation:
Our website is a seating chart generator, which will allow a user to input names of students from their class and will return a random seating chart of a defined table size. Users will be able to easily create random groups of a size of their choosing in a 9 X 9 grid,in addition to future features like being able to move people around and the ability to increase text and grid size for improved visablity. 

## Purpose:
Our website will help teachers easily create random seating charts that they can also customize. Our project owner is Mr. Jenkins, an AP Statistics teacher at Del Norte High School who often uses a program to create his seating chart. Our website models basic requirements and suggestions given by Mr. Jenkins to create a useful and easy-to-use seating chart generator. 

## Project Owner: Mr. Jenkins, Del Norte math teacher

### Requirements from project owner:
* Randomly generate the seating chart
* Have an easy-to-use function for inputting names (either drop a .txt file or something along those lines)
* Have a feature where, after the seating chart is generated, students can be moved around as the user would see fit (e.g. move cells in the table)
* the ability to increase text and grid size for improved visablity
* grid will automatically resize to adapt to avaliable space on program window

OTHER FEATURES THAT MAY BE HELPFUL
* data presets --> store (in a database potentially) what old tables looked like 
* have students formatteed in a 9 by 9 grid


## Project Idea & Wireframes:

Our website will have many pages and a navigation bar to access those pages.

The home page will have: 1) who we are       2) our project idea & inspiration     3)How to access our github/ guide

Home page example:
![Home Page](https://user-images.githubusercontent.com/40574565/157780123-ac5e6886-6f5c-4720-9def-595de35d1a04.png)

##### Form for teachers to enter specific requirements
Fits the MVC requirements & will look something like this: 
![image](https://user-images.githubusercontent.com/40574565/157780850-ff6eaabb-3362-40e0-8381-f889e46ac0ad.png)


##### The seating chart will have names likely  be displayed in a table like so:
![Wireframe](https://user-images.githubusercontent.com/40574565/157778515-ca146e92-d57d-4f29-892b-785428cdd2e3.jpeg)
* This will be easiest to accomodate teachers with different table group sizes, and make the website more adaptable and personalizable even if it is "uglier"
* We could have a "diagram" of tables, but this would be hard to accomodate for if we want to expand to different classrooms which may have different class setups.
* Note, the seating chart will also have features to 

## Success Idea (What a successful project looks like)
A successful project functions properly to create random seating charts, but also allows user to move around cells in the table. It will be something Mr. Jenkins is satisfied with and is actually capable of creating something random. 

## Team Roles:
#### Scrum Master: Rachel Wei
As the Scrum Master, Rachel is responsible for...
1. organizing team activity
2. managing the scrum board
#### Github Admin: Calvin Cheah
As the Github Admin, Calvin is responsible for...
1. organizing branches
#### Technical Officer: Yajat Yadav
As the Technical Officer, Yajat is responsible for...
1. Creating a database for the student info (grade, table number, etc.)
2. Creating algorithms to randomize and save student assignment + manual modifications by teacher
4. Implementing different options for user to input data (excel files, txt files, manual entry)
#### Design Manager: Devam Shrivastava
As the Design Manager, Devam is responsible for...
1. managing the CSS and layouts
2. designing the overall theme and style of the website
#### Deployment Manager: Harry Li
As the Depolyment Manager, Harry is responsible for...
1. depolying the website
2. keeping the deployed website up to date

## Usage:
Clone project and run the project locally. Deployed website coming soon.

## Running Locally:
### Requirements
* Thymeleaf
* jdk >8
#### How to run:
Navigate to and run [Main.java] file 
Go to localhost:8080 in a web browser to view our running website

## How to contribute: 
See `contributing.md`(to be added).
NOTE: Although this may be obvious, please do not push any broken code. Thanks. 

