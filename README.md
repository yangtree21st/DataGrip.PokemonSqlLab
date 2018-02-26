# Froilan The Farmer
* **Objective:** To implement a system indicative of a Farm environment
* **Purpose:** To demonstrate [multi-inheritence design issues](https://www.geeksforgeeks.org/java-and-multiple-inheritance/)


* Consider a system in which
	* All `NoiseMaker` can `makeNoise`
	* All `Animal` are `NoiseMaker`
		* All `Horse` are `Animal`
		* All `Dog` are `Animal`

	* All `Rider` can `mount` and `dismount` a `Rideable` object.

	* All `Vehicle` are `NoiseMaker` and `Rideable`
		* All `FarmVehicle` can `harvest` a `Produce`
			* All `Tractor` are `FarmVehicle`
			* All `CropDuster` are `FarmVehicle`

		* All `Aircraft` can  `fly`
			* All `Plane` are `Aircraft` which can `cruise`
			* All `Jet` are `Aircraft` which can `zoom`

	* All `Produce` can `yield` an `Edible` object.
		* All `CornStalk` can `yield` a `EarCorn`
		* All `TomatoPlant` can `yield` a `Tomato`

	* All `Person` can `eat` an `Edible` object and `makeNoise`.
	* All `Farmer` are `Rider` and `Person`
		* `Froilan` is a `Farmer` who has 
