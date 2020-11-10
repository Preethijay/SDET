fruit_list={
    "apple": 5,
    "banana": 8,
    "grapes": 5,
    "watermelon": 10
}

cust_ans = input("Which fruit are you looking for? ").lower()

if(cust_ans in fruit_list):
  print("Fruit is in stock")
else:
    print("Fruit is not in stock ")  