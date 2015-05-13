class FizzBuzz
  printFizzBuzz: (target) ->
    console.log this.judgeFizzBuzz(target)
    
  judgeFizzBuzz: (target) ->
    if target is 0
      return '#{target} is -.'
    else if target % 3 is 0 && target % 5 is 0
      return '#{target} is FizzBuzz.'
    else if target % 3 is 0
      return '#{target} is Fizz.'
    else if target % 5 is 0
      return '#{target} is Buzz.'
    else
      return '#{target} is -.'

module.exports = FizzBuzz;
