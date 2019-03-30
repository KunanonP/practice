package main

import (
	"fmt"
	"myfactorial"
	"myfibonacci"
	"mymath"
	"mypackage"
)

func main() {
	//Hello world
	fmt.Println("Hello World")
	fmt.Println(mypackage.Reverse("!oG olleH"))

	//basic math
	fmt.Println(mymath.Add(2, 2))
	fmt.Println(mymath.Sub(20, 2))
	fmt.Println(mymath.Multiple(20, 10))
	fmt.Println(mymath.Divide(20, 2))
	fmt.Println(mymath.Remaining(10, 100))

	//fibonacci
	myfibonacci.Fibonacci(5)

	//factorial
	myfactorial.Factorial(6)
	fmt.Println(myfactorial.RecursiveFactorial(6))
}
