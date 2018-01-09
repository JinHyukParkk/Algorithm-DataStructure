package list

import (
	f "fmt"
)

func ArrayTest() {
	//일반적 사용
	var a [3]int
	a[0] = 0
	a[1] = 1
	a[2] = 2
	f.Println(a[1])
	//배열 초기화
	var a1 = [3]int{1, 2, 3}
	f.Println(a1[1])
	//다차원 배열
	var multiArray [1][2][3]int
	multiArray[0][1][2] = 10
	f.Println(multiArray[0][1][2])
	//다차원 배열 초기화
	var a2 = [2][3]int{
		{1, 2, 3},
		{4, 5, 6}, // 끝에 콤마 추가!
	}
	f.Println(a2[1][2])
	f.Println(a2[0][2])
}
