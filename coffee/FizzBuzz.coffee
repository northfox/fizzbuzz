class FizzBuzz
  judgeFizzBuzz: (target) ->
    if target % 3 is 0 && target % 5 is 0
      console.log "#{target} is FizzBuzz."
    else if target % 3 is 0
      console.log "#{target} is Fizzz."
    else if target % 5 is 0
      console.log "#{target} is Buzz."
    else
      console.log "#{target} is -."



sut = new FizzBuzz
sut.judgeFizzBuzz -3
sut.judgeFizzBuzz 0
sut.judgeFizzBuzz 3
sut.judgeFizzBuzz 5
sut.judgeFizzBuzz 15
sut.judgeFizzBuzz 98
sut.judgeFizzBuzz 99
