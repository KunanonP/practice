#This is a guess number game
import random

guessesNumberTaken = 0

print("Please enter player's name: ")
playerName = input()

number = random.randint(1,10)
print(number)
print("The number has randomed between 1 and 10,\n" + playerName + ", you got 5 chances to guess.")

for guessesNumberTaken in range(5):
      print("Take a guess.")
      guess = input()
      guess = int(guess) #convert input number guess to int.

      if guess < number:
          print("Your guess number is too low, try again."  + "\nYou have " + str(4 - guessesNumberTaken)  + " guesses left")

      if guess > number:
          print("your guess number is too high, try again." + "\nYou have " + str(4 - guessesNumberTaken) + " guesses left")

      if guess == number:
          break

if guess == number:
      guessesNumberTaken = str(guessesNumberTaken + 1)
      print("Well done, you take " + guessesNumberTaken + " guesses.")

if guess != number:
      number = str(number)
      print("The correct number is " + number)

      


