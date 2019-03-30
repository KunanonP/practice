package main

import (
	"fmt"
	"mymath"
	"mypackage"
)

func main() {
	fmt.Println("Hello World")
	fmt.Println(mypackage.Reverse("!oG olleH"))
	fmt.Println(mymath.Add(2, 2))
	fmt.Println(mymath.Sub(20, 2))
	fmt.Println(mymath.Multiple(20, 10))
	fmt.Println(mymath.Divide(20, 2))
	fmt.Println(mymath.Remaining(10, 100))
}
