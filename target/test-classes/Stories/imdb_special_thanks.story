Narrative:
In order to find Jim Morris role in Star War I
As a automation engineer
I want to check IMDb site
					 
Scenario:  Special thanks validation under crew list of movie Star War I on IMDB 

Given user is on url <url>
When user searched for <searchText> on page
And user click on <link1> on the page
And user click on <link2> on the page
Then user sees <message1> on the page
And user sees <message2> on the page

Examples:
|url				|searchText			    |link1										|link2										|message1	|message2		|
|http://www.imdb.com|Star Wars: Episode I	|Star Wars: Episode I - The Phantom Menace	|Full Cast and Crew                     	|Jim Morris |special thanks	|