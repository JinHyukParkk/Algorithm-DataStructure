package algo

import "fmt"

// a la russe
func Multiplication() {
	var nA, nB, result int
	fmt.Scan(&nA, &nB)

	for nA >= 1 {
		if nA%2 == 1 {
			result += nB
		}

		nA /= 2
		nB *= 2
	}

	fmt.Println(result)
}
