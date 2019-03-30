package myfibonacci

import "fmt"

func Fibonacci(a int) {
	num1 := 0
	num2 := 1
	temp := 0
	for i := 1; i <= a; i++ {
		temp = num1 + num2
		num1 = num2
		num2 = temp
		fmt.Println(temp)
	}
}
