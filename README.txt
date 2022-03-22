# CS611-LegendsOfValors

Name
-------------------------------------------------------------------------------------------------
--Tiancheng Liang--
--U39385958--

--JiaCheng Gao--
--U5805433--

--ZiFeng Chen--
--U91314804--

Files
-------------------------------------------------------------------------------------------------
<.java file> - <1 line comment about the file 
<Armor.java> - <Armor class represent each armor item,implements Equitable interface to indicate if this armor has been equipped>
<Audio.java> -<Audio class is for load the wav.file and adding the background music during the game>
<Board.java> - <Board object used to init bunch of cells, print cells on command line>
<BushCell.java>-<Bush cell class which extends to the cell class>
<Castable.java> - <castable interface for spell cast, needs to be implemented by each spell concrete class>
<Cell.java> - < abstract class for each cell, inaccessible, marketCell and common cell needs to extend this class>
<Character.java> - < an abstract class for hero and monster or any other character in game>
<CharacterFactory.java> - <return a list of hero or monster contain with singleton pattern>
<PlainCell.java> - <common cell class extend cell>
<DexterityAndAgility.java> - <concrete class for Skill which could be injected to needed classes as strategy pattern. Skill favored on dexterity and agility>
<StrengthAndAgility.java> - <needs to init by hero who favored skill are strength and agility>
<StrengthAndDexterity.java> - <needs to init by hero who favored skill are strength and dexterity>
<Dragon.java> - <concrete class for dragon extend monster class>
<Equipable.java> - <interface that needs to be implemented by any item that could be equipped>
<Exoskeleton.java> -<concrete class for exoskeleton extends to monster class>
<FireSpell.java> - <concrete class for fire spell and extends to spell class>
<Game.java> - <Super class for all game program>
<GameController.java>-<This class contain the main logic of the game process>
<Hero.java>-<Super class for the three types hero, also contain the common methods and attributes>
<HeroNexusCell.java>-<Hero nexus cell class that extends to cell class>
<HeroSelectionController.java>-<This class is for user to choose thier heros and form the team at start of game>
<HeroSelectionController.java> - <This class showing the hero list and information when user choose the heros>
<IceSpell.java> - < concrete class of ice spell and extends to the spell class>
<InaccessibleCell.java> - <class of inaccessible cell and extends to cell class>
<inventory.java> - <This class store the item's information of each hero>
<Kouloucell.java>-<Class of koulou cell and extends to cell class>
<LightingSpell.java>-<concrete class of lighting spell and extends to spell class>
<Main.java> - <The main class use to start the game>
<Market.java> -<The market class store the list of item, and provide user to sell or buy the items>
<MarketCell.java> -< The class of market cell and extends to the cell class>
<Message.java> - <Message class contain the graphics that present during the game process>
<Monster.java> -<Super class of three types monster, contain the common methods and attributes>
<MonsterNexusCell.java> - < class of monster nexus cell and extends to cell class>
<MonsterTeam.java> - <this class create the monster team that have same level and amount of hero team>
<Paladin.java> - <concrete class of paladin and extends to hero class>
<Parser.java> - <this class read the text file and return it as a list>
<PlainCell.java> - < class of plain cell and extends to cell class>
<PlayerTeam.java> - <This class contain the list of heros and have some common method of team, extends to the team class>
<Potion.java> - <concrete class of potion and extend to item class>
<RpgGame.java> -<this class is one of game type and extends to the game class>
<Skill.java> - <strategy pattern for hero's skill which could inject into hero class>
<Sorcerer.java> -< concrete class of sorcerer and extends to hero class>
<Spell.java> - <Super class of all spell type>
<Spirit.java> -< concrete class of spirit and extends to monster class>
<StrngthAndAgility.java>-<concrete class for hero that favored in strength and agility >
<StrengthAndDexterity.java> -<concrete class for hero that favored in strength and dexterity>
<Team.java> -<Super class of all player type>
<usable.java> -<this class could be implemented by item that will have some use time limitation leave this class hero for extendable purpose>
<UtilCheckInput.java> -<util class for the purpose of checking user valid input>
<Warrior.java>-<Concrete class of warrior and extends to hero class>
<Weapon.java> -<concrete class of weapon and extends to item class>



Notes:
-------------------------------------------------------------------------------------------------
1. Files to be parsed should be stored in ConfigFiles, for parser class to read class
    Please put ConfigFiles under the src directory
2. Bonus Done
	The board has color. 
	The game has background music
	UI desgin
	Added some extra graphics at start of game and middle of the game

3. Things instructions to note
	Design Pattern that I used:
		1): Strategy pattern for hero's skill. Each hero has different skill. Abstract class hero should implement skill interface. 
		2): Singleton pattern and Factory pattern. Once object has concrete object, it will be returned. (In ItemFactory. java and CharacterFactory.java)
		3): MVC pattern was used in GameController class, user could use controller to view the whole game structrue.
How to run:
-------------------------------------------------------------------------------------------------
1. Navigate to the directory after downloading the project

	After downloading the project, find the Main class that is where main method located. And execute that class.

2. Run the following instructions on command line:
	javac *.java
	java Main.java
