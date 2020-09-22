package tree

import "fmt"

type Tree struct {
	Node *Node
}

type Node struct {
	left  *Node
	right *Node
	value int
}

func (t *Tree) Init() *Tree {
	return t
}
func New() *Tree { return new(Tree).Init() }

func (t *Tree) Insert(value int) *Tree {
	// tree가 nil 이면 root 노드 설정
	if t.Node == nil {
		t.Node = &Node{value: value}
	} else {
		t.Node.InsertNode(value)
	}
	return t
}

func (n *Node) ExistsNode(value int) bool {
	if n == nil {
		return false
	}
	if n.value == value {
		return true
	}
	if value <= n.value {
		return n.left.ExistsNode(value)
	} else {
		return n.right.ExistsNode(value)
	}
}

// 순회 프린트
func PrintNode(n *Node) {
	if n == nil {
		return
	}
	// 전위 순회
	fmt.Println(n.value)
	PrintNode(n.left)
	PrintNode(n.right)

	// 중위 순회
	// PrintNode(n.left)
	// fmt.Println(n.value)
	// PrintNode(n.right)

	// 후위 순회
	// PrintNode(n.left)
	// PrintNode(n.right)
	// fmt.Println(n.value)
}

func (n *Node) InsertNode(value int) {
	if value <= n.value {
		if n.left == nil {
			n.left = &Node{value: value}
		} else {
			n.left.InsertNode(value)
		}
	} else {
		if n.right == nil {
			n.right = &Node{value: value}
		} else {
			n.right.InsertNode(value)
		}
	}
}
