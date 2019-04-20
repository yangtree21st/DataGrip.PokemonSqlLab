
# What are all the types of pokemon that a pokemon can have?
SELECT name From pokemon.types;
# What is the name of the pokemon with id 45?
SELECT name From pokemon.pokemons where id = 45;
# How many pokemon are there?
select count(id) from pokemon.pokemons;
# How many types are there?
select count(id) from pokemon.types;
# How many pokemon have a secondary type?
select count(id) from pokemon.pokemons where secondary_type>0;


#What is each pokemon's primary type?
select p.name, t.name
from pokemon.pokemons p join pokemon.types t
on p.primary_type = t.id;
#What is Rufflet's secondary type?
select p.name, t.name from pokemon.pokemons p join pokemon.types t
on p.secondary_type = t.id and p.name = 'Rufflet';

#What are the names of the pokemon that belong to the trainer with trainerID 303?
SELECT p.name, r.trainerID from pokemon.pokemons p join pokemon.pokemon_trainer r
on p.id = r.pokemon_id and r.trainerID = 303;
#How many pokemon have a secondary type Poison
select count(p.id) from pokemon.pokemons p join pokemon.types t
on p.secondary_type = t.id and t.name = 'Poison'  ;
#What are all the primary types and how many pokemon have that type?
select count(p.id), t.name
FROM pokemon.types t
INNER JOIN pokemon.pokemons p
where t.id = p.primary_type
GROUP BY t.name;
# How many pokemon at level 100 does each trainer with at least one level 100 pokemone have? (Hint: your query should not display a trainer
select count(p.id),r.trainerID
from pokemon.pokemons p join pokemon.pokemon_trainer r
where p.id = r.pokemon_id and r.pokelevel =100
GROUP BY r.trainerID;
#How many pokemon only belong to one trainer and no other?
SELECT p.name
FROM pokemon.pokemons p
       JOIN pokemon.pokemon_trainer t
WHERE p.id = t.pokemon_id
GROUP BY p.name
having COUNT(t.pokemon_id) = 1;

# Part 4: Final Report
# Trainers are sorted by the sum of the levels of the Pokemon they have

SELECT s.trainername,SUM(r.pokelevel)
from pokemon.trainers s join pokemon.pokemon_trainer r
where s.trainerID = r.trainerID
group by s.trainername
order by SUM(r.pokelevel) DESC

