package list

import (
  f "fmt"
)

type Node struct {
	next *Node
	prev *Node
	key  interface{}
}

type List struct {
	head *Node
	len  int
}

func (l *List) Init() *List {
	l.head = nil
	l.len = 0
	return l
}
func New() *List { return new(List).Init() }

func (l *List) Len() int { return l.len }

func (l *List) Front() *Node {
	if l.len == 0 {
		return nil
	}
	return l.head
}

func (l *List) Insert(key interface{}) {
	list := &Node{next: nil, prev: nil, key: key}
	if l.head == nil {
		l.head = list
    l.head.next = l.head
    l.head.prev = l.head
	} else {
    tail := l.head.prev
    tail.next.prev = list
    tail.next = list
    list.next = l.head
    list.prev = tail
	}
  l.len++
}

func (l *List) Delete(key interface{}) {
	pNode := l.head
  if pNode == nil {
     return
  }else {
    if pNode.key != key {
      for pNode != l.head {
        pNode = pNode.next
        if pNode.key == key {
          break
        }
      }
    }
    if pNode == l.head {
      l.head.prev.next = pNode.next
      l.head.next.prev = pNode.prev
      l.head = pNode.next
    }else {
      temp := pNode
      pNode.prev.next = temp.next
      pNode.next.prev = temp.prev
    }
  }
  l.len--
}
func (l *List) Display() {
	tempPoint := l.head
  if tempPoint.next == l.head {
    f.Print("Null")
  }
  if tempPoint.next == l.head {
    f.Printf("%+v", tempPoint.key)
  }else {
    for tempPoint.next != l.head {
      f.Printf("%+v -> ", tempPoint.key)
      tempPoint = tempPoint.next
    }
    f.Printf("%+v", tempPoint.key)
  }
	f.Println()
}
