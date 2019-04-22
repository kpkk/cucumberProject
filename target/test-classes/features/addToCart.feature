Feature: adding a product to cart

Scenario: picking a merchandise from search page and add to cart

Given :user is on the online shopping site
When : clicked on the item to select
And : entered the quantity
And : clicked on add to cart button
Then : product should be added uccesfully to the cart
  