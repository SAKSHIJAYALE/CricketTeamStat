Cricket Team Stats:
As a member of technical expertise for a cricket board, you need to write RESP APIs to find the following details

CRUD OPERATION
1. Create an API to insert players' details.
2. Update Player details
3. Delete Player details

GET OPERATION
1. Get player details by passing the player ID
2. Get the player list with an average score more than X. Where X is a number.
3. Get the Player List By Country.
4. Get a List of players in sorted order whose average scores are more than Y. where Y is the number. If two players have the same average, then the older player will get the priority.

Player Details:
1. ID
2. Name
3. Date of birth
4. Match ID

Match Detail:
1. ID
2. Score
3. Stadium

• Use Spring-boot to create the Application.
• Use HSQL in-memory DB or Mysql if you have access to.
• Only Admin users can do the CRUD operation.
• Write code with minimal code smell.
• Write Junit for the service class.
