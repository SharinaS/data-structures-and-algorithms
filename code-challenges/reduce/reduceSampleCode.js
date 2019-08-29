
// =========== This code should not be used with testing. It is examples from class on Reduce ==========
// =========== More helpful code on Reduce found at: https://jrsinclair.com/articles/2019/five-ways-to-average-with-js-reduce/

// array.reduce()

let numbers = [1,2,3,4];

let sum = numbers.reduce((answerSoFar, value, idx) => {
  answerSoFar = answerSoFar + value;
  return answerSoFar;
}, 0);

// answerSoFar = the answer so far - also called accumulator
// value = the value of the array at position[i]
// idx = the index position
// 0 = the starting value for the accumulator

// console.log(sum)


let people = [
  {name:'OtherJohn', role:'Developer'},
  {name:'Sharina', role:'Developer'},
  {name:'Peter', role:'Manager'},
  {name:'James', role:'Support'}
];
  
// answerSoFar starts as an empty object
// then we assign the value of each person.name to person.role
// person.name: person.role => 'OtherJohn': 'Developer'

let folks = people.reduce( (answerSoFar, person, idx) => {
  answerSoFar[person.name] = person.role; 
  return answerSoFar;
}, {} );
  
// console.log(folks);




// CHALLENGE: USE .REDUCE() TO RETURN AN ARRAY OF THE NAMES OF ALL THE PEOPLE

let names = people.reduce((answerSoFar, value, idx) =>{
  answerSoFar.push(value.name);
  return answerSoFar;
}, []);

// console.log(names)

  
// CHALLENGE: USE .REDUCE() TO RETURN AN ARRAY OF THE NAMES OF EVERYONE EXCEPT THE DEVELOPERS

let noDevs = people.reduce((answerSoFar, person) =>{
  if(person.role !== 'Developer'){
    answerSoFar.push(person.name);
  }
  return answerSoFar;
}, [])

console.log(noDevs)

// CHALLENGE: FIND THE SHORTEST STRING
const strings = ['abc', 'bc', 'eigi', 'h', 'eklsie'];

let shortest = strings.reduce((answerSoFar, value, idx) => {
  if (value.length < answerSoFar.length){
    answerSoFar = value;
  } 
  return answerSoFar;
});
console.log(shortest);



