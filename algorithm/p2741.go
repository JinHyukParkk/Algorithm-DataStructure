package main

import (
	b "bytes"
	f "fmt"
	s "strconv"
)

func main() {
	var n int
	f.Scan(&n)
	var buf b.Buffer
	for i := 1; i <= n; i++ {
		buf.WriteString(s.Itoa(i))
		buf.WriteString("\n")
	}
	f.Println(buf.String())
	f.Println("sss")
}
