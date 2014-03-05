def square = {it * it }

square(8)

[1,2,3,4,5].collect(square)


def var = ""
def myList = [1,2,3,4,5]

myList.each {
	var += "$it "
}


3.times { println "Doug is cool"}
3.times { println "index is ${it}"}
