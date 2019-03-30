package myfactorial

import "fmt"

func Factorial(a int) {
	summ := 1
	for i := 2; i <= a; i++ {
		summ = summ * i
		fmt.Println(summ)
	}
}

func RecursiveFactorial(n int) int {

	if n == 0 {
		return 1
	}
	return n * RecursiveFactorial(n-1)
}
