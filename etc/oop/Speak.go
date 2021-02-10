package oop

type Speaker interface {
	Speak()
}

func Speak(speaker Speaker) {
	speaker.Speak()
}
