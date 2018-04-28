package lotto

import (
	"math/rand"
	"sort"
	"strconv"
	"strings"
	"time"
)

type Lotto struct {
	generated []int
	rng       *rand.Rand
}

func NewLotto() *Lotto {
	seed := rand.NewSource(time.Now().UnixNano())
	rng := rand.New(seed)

	lotto := &Lotto{
		generated: make([]int, 0),
		rng:       rng,
	}

	lotto.generate()

	return lotto
}

func (lotto *Lotto) generate() *Lotto {
	generated := map[int]bool{}

	for {
		if len(generated) >= 6 {
			break
		}

		v := lotto.rng.Int()%45 + 1

		if !generated[v] {
			generated[v] = true
		}
	}

	for k := range generated {
		lotto.generated = append(lotto.generated, k)
	}

	sort.Ints(lotto.generated)

	return lotto
}

func (lotto *Lotto) ToString() string {
	buffer := make([]string, 0)

	for _, v := range lotto.generated {
		buffer = append(buffer, strconv.Itoa(v))
	}

	return strings.Join(buffer, ", ")
}

//  NewLotto() 함수를 통해 번호 객체 생성
// ToString() 을 통해 출력
