package tree

type Tree struct {
	node *Node
}

type Node struct {
	left  *Node
	right *Node
	key   interface{}
}

func (t *Tree) insert(value int) *Tree {
	// tree가 nil 이면 root 노드 설정
	if t.node == nil {
		t.node = &Node{value: value}
	} else {
		t.node.insert(value)
	}
	return t
}
