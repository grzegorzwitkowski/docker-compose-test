db.createUser({user: 'dockercomposetest', pwd: 'dockercomposetest', roles: ['readWrite']})

db.users.insert({_id: 1, firstName: "Jan", lastName: "Kowalski", age: 25})
db.users.insert({_id: 2, firstName: "Adam", lastName: "Nowak", age: 28})
db.users.insert({_id: 3, firstName: "Anna", lastName: "Woźniak", age: 26})
db.users.insert({_id: 4, firstName: "Justyna", lastName: "Jankowska", age: 30})
