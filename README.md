# Magical Arena

## Introduction
This project is a simulation of a Magical Arena where two players fight until one of them dies. Each player has attributes: health, strength, and attack. Players attack in turns, and the damage calculation is based on dice rolls.




## How to Run
Save the code in a file named Main.java.
Compile the code using javac Main.java.
Run the code using java Main.

### Prerequisites
- Java 8 or above
- Maven

### Steps
1. Clone the repository:
    ```
    git clone <repository-url>
    ```
2. Navigate to the project directory:
    ```
    cd MagicalArena
    ```
3. Compile the project:
    ```
    mvn clean compile
    ```
4. Run the project:
    ```
    mvn exec:java -Dexec.mainClass="arena.Main"
    ```
5. To run the tests:
    ```
    mvn test
    ```




## Game Rules

1. **Player Attributes**: Every player is defined by a 'health' attribute, 'strength' attribute, and an 'attack' attribute - all positive integers. The player dies if their health attribute reaches 0.
2. **Turn-Based Combat**: Any two players can fight a match in the arena. Players attack in turns.
3. **Dice Rolls**: The attacking player rolls the attacking dice, and the defending player rolls the defending dice.
4. **Damage Calculation**:
    - The attack value multiplied by the outcome of the attacking dice roll is the damage created by the attacker.
    - The defender's strength value multiplied by the outcome of the defending dice roll is the damage defended by the defender.
    - The damage created by the attacker that exceeds the damage defended by the defender reduces the defender's health.
5. **Game End**: The game ends when any player's health reaches 0.
6. **Attack Order**: The player with lower health attacks first at the start of a match.




## Design (Classes)
The project is divided into the following classes:
- `Player`: Represents a player with attributes health, strength, and attack.
- `Arena`: Manages the battle between two players.
- `Dice`: Simulates a dice roll.
- `Main`: The entry point of the application.






