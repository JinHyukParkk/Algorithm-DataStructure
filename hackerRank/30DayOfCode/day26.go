package main

import "fmt"

type Date struct {
	day   int
	month int
	year  int
}

func check(n int, c int) bool {
	if n == c {
		return true
	}
	return false
}

func before(d1 Date, d2 Date) bool {
	if d1.year > d2.year {
		return true
	} else if d1.year == d2.year && d1.month > d2.month {
		return true
	} else if d1.year == d2.year && d1.month == d2.month && d1.day > d2.day {
		return true
	}
	return false
}
func day26() {
	date1 := Date{}
	fmt.Scan(&date1.day)
	fmt.Scan(&date1.month)
	fmt.Scan(&date1.year)
	date2 := Date{}
	fmt.Scan(&date2.day)
	fmt.Scan(&date2.month)
	fmt.Scan(&date2.year)

	fine := 0
	if check(date1.day, date2.day) && check(date1.month, date2.month) && check(date1.year, date2.year) || !before(date1, date2) {
		fine = 0
	} else if check(date1.month, date2.month) && check(date1.year, date2.year) {
		fine = 15 * (date1.day - date2.day)
	} else if check(date1.year, date2.year) {
		fine = 500 * (date1.month - date2.month)
	} else {
		fine = 10000
	}
	fmt.Println(fine)
}
