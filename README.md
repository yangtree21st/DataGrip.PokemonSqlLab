# Froilan The Farmer
* **Objective:** To implement a system indicative of a Farm environment
* **Purpose:** To demonstrate [multi-inheritence design issues](https://www.geeksforgeeks.org/java-and-multiple-inheritance/)


* Consider a system in which 
	* `NoiseMaker` can `makeNoise`
	* `Animal` is a `NoiseMaker`
		* `Horse` is a `Animal`
		* `Dog` is a `Animal`

	* `Rider` can `mount` and `dismount` a `Rideable` object.

	* `Vehicle` are `NoiseMaker` and `Rideable`
		* `FarmVehicle` can `harvest` a `Produce`
			* `Tractor` are `FarmVehicle`
			* `CropDuster` are `FarmVehicle`

		* `Aircraft` can  `fly`
			* `Plane` are `Aircraft` which can `cruise`
			* `Jet` are `Aircraft` which can `zoom`

	* `Produce` can `yield` an `Edible` object.
		* `CornStalk` can `yield` a `EarCorn`
		* `TomatoPlant` can `yield` a `Tomato`

	* `Person` can `eat` an `Edible` object and `makeNoise`.
	* `Farmer` are `Rider` and `Person`


* Consider 
	* `Froilan` is a `Farmer` who has 5 horses
