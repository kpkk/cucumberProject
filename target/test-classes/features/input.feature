Feature: Login functinality of facebook
Given:user on the facebook login page
Scenario-Outline: Postive flow of login test

When: Type in the <user> and <pass>
And: Click on sigin button;
Then user should be navigated to FaceBook home page

Examples:
|user|pass|
|pradeep|pass|