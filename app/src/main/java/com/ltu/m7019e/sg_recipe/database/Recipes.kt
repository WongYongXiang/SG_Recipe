package com.ltu.m7019e.sg_recipe.database

import com.ltu.m7019e.sg_recipe.R
import com.ltu.m7019e.sg_recipe.model.Recipe


class Recipes {
    fun getRecipes(): List<Recipe>{
        return listOf(
            Recipe(
                1,
                "Hainanese Chicken Rice",  // Name of the dishes
                "3-4 people",  // How many people it can serve
                "Ingredients for Rice\n" +   // Ingredients needed
                        "3 cups uncooked rice (washed)\n" +
                        "5 tbsp vegetable oil\n" +
                        "4 cloves garlic (finely chopped)\n" +
                        "4 shallots (finely chopped)\n" +
                        "2½ cups chicken broth stock\n" +
                        "4-6 blades of pandan leave (screwpine leaves)\n" +
                        "1 small thumb of ginger (cleaned and bruised)\n" +
                        "1½ tsp salt (to taste)\n" +
                        "Ingredients for Chicken\n" +
                        "1 whole chicken\n" +
                        "1 small thumb of ginger (cleaned and bruised)\n" +
                        "5-6 stalks of spring onions (washed and chopped)\n" +
                        "10 bowls chicken stock (adjust accordingly)\n" +
                        "4 blades of pandan leaves (screwpine leaves)\n" +
                        "2 tsp of salt\n" +
                        "10 bowls of cold water\n" +
                        "1 cucumber (sliced diagonally)\n" +
                        "Ingredients for Sauce\n" +
                        "2 tbsp light soy sauce\n" +
                        "2 tbsp chicken broth\n" +
                        "3 tsp Yeo's Pure Sesame Oil\n" +
                        "1 tsp sugar\n" +
                        "Ingredients for Chicken Rice Chilli Sauce\n" +
                        "90g red chilies (you may add in some bird’s eye chili)\n" +
                        "15g garlic\n" +
                        "50g ginger\n" +
                        "1 tsp salt\n" +
                        "1 tsp sugar\n" +
                        "50ml chicken broth\n" +
                        "60ml lime juice (to taste)\n" +
                        "Ingredients for Garnish\n" +
                        "coriander leaves",
                "To Make the Chicken\n" +  // Directions
                        "Wash chicken, drain well, stuff ginger and scallion into the chicken’s cavity. Rub 2 tsp salt all over the chicken.\n" +
                        "In a large stockpot that can fit a whole chicken, add water enough to cover the whole chicken together with pandan leaves and salt. Bring water to a rolling boil.\n" +
                        "Submerge the whole chicken, breast side down. Bring to a full boil and then lower the heat to a gentle simmer, lid on, for 10 mins only.\n" +
                        "After 10 minutes, turn the heat off, and let the chicken remain in the pot of water for 40 minutes, lid remains on.\n" +
                        "After 40 minutes, remove the chicken and place gently into a bowl of water with ice for 10 mins. Retain the chicken stock.\n" +
                        "Drain the chicken, discard ginger and scallion from the cavity and set it aside to cool before chopping it neatly into desired serving size.\n" +
                        "To Make the Rice\n" +
                        "Heat oil in wok, fry chopped shallots and garlic until fragrant and golden in colour. Add rice and stir well. Transfer the rice mixture to rice cooker.\n" +
                        "Add in chicken broth stock, pandan leaves and salt into the rice mixture. Mix well and press ”cook”. When the rice is cooked, fluff with a ladle.\n" +
                        "To Serve\n" +
                        "Line a serving plate with cucumber slices.\n" +
                        "Arrange chicken pieces on top, pour in the prepared sauce and garnish with coriander leaves.\n" +
                        "Serve with chicken rice, side soup* and chicken rice chilli sauce.\n" +
                        "Your Hainanese chicken rice is ready!\n" +
                        "*Tips\n" +
                        "Any left over chicken broth can be served as side soup, garnish with chopped spring onions or coriander.",
                R.drawable.hainanese_chicken_rice
            ),
            Recipe(
                2,
                "Dry Bak Chor Mee",
                "2 people",
                "For Mushrooms\n" +
                        "50g dried shiitake mushrooms (soaked, thinly sliced)\n" +
                        "750ml water (including mushroom soaking liquid, filtered)\n" +
                        "1 tbsp dark soy sauce\n" +
                        "1 tsp light soy sauce\n" +
                        "1 tsp rock sugar\n" +
                        "For Minced Pork\n" +
                        "150g minced pork\n" +
                        "1 tsp light soy sauce\n" +
                        "3 dashes white pepper powder\n" +
                        "1 tsp cornflour\n" +
                        "1 tsp sesame oil\n" +
                        "For Pork Liver\n" +
                        "8 thinly sliced pork liver\n" +
                        "¼ tsp light soy sauce\n" +
                        "2 dashes white pepper powder\n" +
                        "½ tsp cornflour\n" +
                        "For Pork Slices\n" +
                        "8 thinly sliced lean pork\n" +
                        "¼ tsp light soy sauce\n" +
                        "2 dashes white pepper powder\n" +
                        "½ tsp cornflour\n" +
                        "For Soup\n" +
                        "1L dried anchovies stock/hot water\n" +
                        "8 pork meatballs\n" +
                        "Sauce (per serving)\n" +
                        "½ tsp Chinese fish sauce\n" +
                        "1 tsp black vinegar\n" +
                        "1 tbsp mushroom stewing sauce (from braised mushroom)\n" +
                        "1 tbsp hot stock\n" +
                        "1 tbsp sambal tumis (for spicy)/ketchup (for non-spicy)\n" +
                        "1 tsp lard croutons\n" +
                        "1 tsp lard oil/shallot oil\n" +
                        "For Serving\n" +
                        "1 bundle fresh thin egg noodles (cooked and drained)\n" +
                        "Small handful of bean shoots (cooked and drained)\n" +
                        "Fish cakes (sliced)\n" +
                        "Spring onions (chopped and sautéed)\n" +
                        "Lettuce",
                "To Cook the Mushrooms\n" +
                        "In a small pot, add mushrooms with the remaining mushroom ingredients and simmer for 30 mins until tender. Set aside.\n" +
                        "To Make Soup\n" +
                        "Add the dried anchovies stock/hot water and meatballs into pot and bring to boil. Lower the heat to simmer for 5 mins and keep the soup bubbling at low heat.\n" +
                        "To Cook the Pork\n" +
                        "Marinade the minced pork, pork livers and pork slices with the respective ingredients separately for 10 mins. Divide into 2 portions.\n" +
                        "Ladle hot soup into each pork portions, set aside for 1-2 mins, then return them into hot soup pot through a slotted ladle and cook for a few secs. Use chopsticks to separate the minced pork into smaller pieces. Drain.\n" +
                        "To Serve\n" +
                        "In a serving bowl, add the sauce ingredients, noodles and bean shoots, mix well. Top with braised mushrooms, minced pork, pork liver, pork slices, fish cakes and lettuce. Garnish with sautéed spring onions and lard croutons.",
                R.drawable.dry_bak_chor_mee
            ),
            Recipe(
                3,
                "Singaporean Char Kway Teow",
                "2-3 people",
                "Main Ingredients\n" +
                        "500g fresh flat rice noodles (loosened)\n" +
                        "4 tbsp cooking oil or pork lard\n" +
                        "2 tbsp minced garlic\n" +
                        "30g lap cheong/Chinese sausage (sliced)\n" +
                        "10 medium raw prawns (deveined with tail on)\n" +
                        "30g Chinese chives (cut into 5cm batons)\n" +
                        "100g bean sprouts\n" +
                        "2 eggs\n" +
                        "Sauce\n" +
                        "3 tbsp ABC Kecap Manis Sweet Soy Sauce\n" +
                        "1 tbsp light soy sauce\n" +
                        "1 tsp dark soy sauce\n" +
                        "Dash of pepper\n" +
                        "For Garnish\n" +
                        "Sambal chilli\n" +
                        "Limes",
                "Mix all the sauce ingredients together and set aside.\n" +
                        "If using a small wok or fry pan, make it is recommended to make one serving at a time. Heat up wok or fry pan with half the cooking oil on medium heat. Sauté half the garlic for 30 secs, toss in half the prawns and half of the lap cheong. Cook for 1 min while keep stirring.\n" +
                        "Toss in half the flat rice noodles. Spread them out and let them sear for 30 secs without stirring. Stir them around and pour in half the sauce and a dash of pepper. Stir to coat.\n" +
                        "Add in half the chives, stir for 30 secs. Crack in an egg in the centre, break up the yolk and spread out and let it fry for 30 secs. Scramble the egg and stir in the rest of items together.\n" +
                        "Toss in half the bean sprouts, stir for 15 secs and serve onto serving plate.\n" +
                        "Continue to cook the second serve in the same sequence.\n" +
                        "Serve while hot with sambal chilli and lime.",
                R.drawable.char_kway_teow

            ),
            Recipe(
                4,
                "Singapore Laksa",
                "6 people",
                "/Ingredients for Base Stock\n" +
                        "Prawn shells from 1 kg of fresh prawns\n" +
                        "1½L water\n" +
                        "2 tbsp oil\n" +
                        "Ingredients for Spice Paste\n" +
                        "10g dried chillies\n" +
                        "40g red chillies\n" +
                        "100g shallots\n" +
                        "15g garlic\n" +
                        "8g candlenuts\n" +
                        "10g ginger\n" +
                        "10g galangal\n" +
                        "10g fresh turmeric (or 2 ½ tsp turmeric powder)\n" +
                        "30g lemongrass (white section only)\n" +
                        "10g toasted belacan (shrimp paste)\n" +
                        "15g dried shrimps (soaked)\n" +
                        "3g coriander seeds\n" +
                        "100ml water\n" +
                        "½ cup oil ( for frying)\n" +
                        "Ingredients for Laksa Gravy\n" +
                        "1.5L prawn broth\n" +
                        "400ml coconut milk\n" +
                        "4 tbsp fish sauce\n" +
                        "½ tsp salt\n" +
                        "1 tbsp gula Melaka/coconut sugar\n" +
                        "1 pkt tofu puffs (sliced half)\n" +
                        "Ingredients for Sambal (to be prepared in advance)\n" +
                        "20g dried chillies\n" +
                        "150g shallots\n" +
                        "20g garlic\n" +
                        "15g belacan (shrimp paste)\n" +
                        "20g dried shrimps (soaked)\n" +
                        "1 tbsp tamarind paste\n" +
                        "Salt and sugar (to taste)\n" +
                        "½ cup oil (for frying)\n" +
                        "Ingredients to assemble\n" +
                        "3 hard-boiled eggs\n" +
                        "400g thick laksa noodles (soaked as per package instructions)\n" +
                        "Prawns\n" +
                        "Fish cakes slices\n" +
                        "Bean sprouts\n" +
                        "Laksa leaves (cut finely)\n",
                "To Make\n" +
                        "To make the prawn stock, heat up a large heavy bottom pot with oil and fry the prawn shells until they dry up.\n" +
                        "Next, pour in the water and let it come to a boil. Once boiling, reduce to low heat and simmer for 1 hour, covered. Once the stock is ready, remove the prawn shells.\n" +
                        "Next, blend together all the spice paste ingredients until you get a smooth wet paste. Heat up oil in a soup pot (once it starts to smoke) then sauté the spice paste on medium heat until you see the oil bubbling.\n" +
                        "Then, add in coconut milk, prawn stock, fish sauce, salt and gula Melaka. Let it come to a boil and add in tofu puffs. Let it simmer for 10 mins.\n" +
                        "In a separate pot, cook laksa noodles, fish cakes and and bean sprouts.\n" +
                        "To assemble, place a portion of noodles into bowl, scoop laksa broth over and garnish with hard boiled egg, tofu puff, sliced fishcakes, blanched bean sprouts, laksa leaves and sambal.\n" +
                        "For the sambal, prepare ahead by sautéing all the ingredients except tamarind paste. Once it is about to be ready add in tamarind paste and season with salt and sugar. Serve sambal on the side.",
                R.drawable.laksa
            ),
            Recipe(
                5,
                "Fried Carrot Cake (Chai Tow Kway)",
                "5-6 people",
                "Ingredients (Carrot Cake)\n" +
                        "500g daikon (grated or finely shredded)\n" +
                        "200g rice flour\n" +
                        "15g wheat starch\n" +
                        "15g cornflour\n" +
                        "1 tsp salt\n" +
                        "¼ tsp white pepper\n" +
                        "1½ tbsp sugar\n" +
                        "Approximately 800 ml water\n" +
                        "For Frying the Carrot Cake\n" +
                        "2-3 tbsp oil\n" +
                        "400g steamed carrot cake (as prepared above, cut to ½in cubed pieces of)\n" +
                        "1 tbsp preserved salted radish (quickly soak, drained, chopped)\n" +
                        "2 cloves garlic (chopped)\n" +
                        "1 tsp light soy sauce\n" +
                        "½ tsp fish sauce\n" +
                        "½ tsp sugar\n" +
                        "1 large egg (beaten) + ¼ tsp soy sauce and dash of pepper\n" +
                        "½ tsp sambal chilli\n" +
                        "100g bean sprouts\n" +
                        "2 tbsp spring onions (chopped)",
                "To Prep\n" +
                        "Grease an 8in square or round pan and set aside. Prepare the steamer.\n" +
                        "Take the grated radish and squeeze out as much juice as you can into a separate large bowl. Add additional water to the daikon juice to make up to 900ml of liquid.\n" +
                        "Mix rice flour, wheat starch, cornflour, salt, pepper and sugar into the liquid. Stir until batter is smooth.\n" +
                        "To Cook\n" +
                        "Place radish in a large pot, and heat over medium heat. Continue stirring for a few minutes to let any excess liquid evaporate. Add the batter and continue stirring to mix evenly. Continue cooking and stirring until batter thickens and turns starchy. Turn off the heat and continue stirring to mix well. Pour into the greased pan and level the top.\n" +
                        "Steam for about 45 mins until cooked. The cake firms up when cooled. Refrigerate the cake so that it’s easier to cut into cubes for frying.\n" +
                        "In a non-stick wok or pan, add the oil and place over high heat. When heated up, carefully add cubed carrot cake into the pan. Spread them out and be careful of oil splattering. Leave to cook on one side for 1-2 mins before turning them over to fry the other side.\n" +
                        "When both sides are crisp and golden brown, push the cubes aside with a spatula. Using the spatula, bring the oil to the centre and add garlic and preserved radish. Saute for ½ min and using the spatula, combine with the carrot cake. Drizzle in the soy sauce, fish sauce and sugar and sambal. Mix it thoroughly.\n" +
                        "Arrange the carrot cake in the centre of the pan in one layer. Slowly pour the beaten egg mixture over the entire surface. Use your spatula to gently move the carrot cake so that the egg settles in between the pieces. Leave it for a minute to crisp up.\n" +
                        "Then using the spatula, cut into and flip each carrot cake cube over to cook the other side for ½ min. Flip over again for a few seconds, then flip back. Turn off the heat and transfer to a serving plate. Sprinkle with chopped scallions and serve immediately.",
                R.drawable.fried_carrot_cake

            )
        )
    }

    fun searchRecipes(query: String): List<Recipe> {
        return getRecipes().filter { recipe ->
            recipe.name.contains(query, ignoreCase = true) ||
                    recipe.ingredients.contains(query, ignoreCase = true)
        }
    }
}