import math

def pizza_wahala():
    print("""
    Welcome to Iya Afeez Pizza Joint, Ajegunle.

                    MENU                         
.....................................................................................................................................................
    Pizza type            Number of Slices        Price of box        
.....................................................................................................................................................

    1. Sapa Size                 4                     2,000

    2. Small Money               6                     2,400

    3. Big Boys                  8                     3,000

    4. Odogwu                    12                    5,200
..................................................................................................................................................    
    0: Exit


    What pizza type are you buying today?
    (pick options 1-4).
    """)

    while True:
        try:
            type_chosen = int(input())

            if type_chosen == 0:
                print("Thank you for your patronage, See you next time.")
                break

            elif type_chosen == 1:
                customers_for_sapa_size = int(input("How many customers are paying? "))
                if customers_for_sapa_size > 0:
                    sapa_size = 4
                    sapa_price = 2000

                    sapa = customers_for_sapa_size / sapa_size
                    sapa_boxes = math.ceil(sapa)
                    sapa_slices_left = (sapa_boxes * sapa_size) - customers_for_sapa_size
                    total_price = sapa_price * sapa_boxes

                    print("          PURCHASE DETAILS")
                    print("Pizza Type: Sapa Size:")
                    print(f"\nTotal Boxes: {sapa_boxes}")
                    print(f"For {customers_for_sapa_size} person(s)\nTotal Price: #{total_price}\nLeftover Slices: {sapa_slices_left}")
                    print("\n     Enjoy Your Pizza")
                else:
                    print("Invalid Input, please try again")

            elif type_chosen == 2:
                customers_for_small_boys_size = int(input("How many customers are paying? "))
                if customers_for_small_boys_size > 0:
                    small_boys_size = 6
                    small_boys_size_price = 2400

                    small_boys = customers_for_small_boys_size / small_boys_size
                    small_boys_boxes = math.ceil(small_boys)
                    small_boys_slices_left = (small_boys_boxes * small_boys_size) - customers_for_small_boys_size
                    total_price = small_boys_size_price * small_boys_boxes

                    print("          PURCHASE DETAILS")
                    print("Pizza Type: Small Boys Size:")
                    print(f"\nTotal Boxes: {small_boys_boxes}")
                    print(f"For {customers_for_small_boys_size} person(s)\nTotal Price: #{total_price}\nLeftover Slices: {small_boys_slices_left}")
                    print("\n     Enjoy Your Pizza")
                else:
                    print("Invalid Input, please try again")

            elif type_chosen == 3:
                customers_for_big_boys_size = int(input("How many customers are paying? "))
                if customers_for_big_boys_size > 0:
                    big_boys_size = 8
                    big_boys_size_price = 3000

                    big_boys = customers_for_big_boys_size / big_boys_size
                    big_boys_boxes = math.ceil(big_boys)
                    big_boys_slices_left = (big_boys_boxes * big_boys_size) - customers_for_big_boys_size
                    total_price = big_boys_size_price * big_boys_boxes

                    print("          PURCHASE DETAILS")
                    print("Pizza Type: Big Boys Size:")
                    print(f"\nTotal Boxes: {big_boys_boxes}")
                    print(f"For {customers_for_big_boys_size} person(s)\nTotal Price: #{total_price}\nLeftover Slices: {big_boys_slices_left}")
                    print("\n     Enjoy Your Pizza")
                else:
                    print("Invalid Input, please try again")

            elif type_chosen == 4:
                customers_for_odogwu_size = int(input("How many customers are paying? "))
                if customers_for_odogwu_size > 0:
                    odogwu_size = 12
                    odogwu_price = 5200

                    odogwu = customers_for_odogwu_size / odogwu_size
                    odogwu_boxes = math.ceil(odogwu)
                    odogwu_slices_left = (odogwu_boxes * odogwu_size) - customers_for_odogwu_size
                    total_price = odogwu_price * odogwu_boxes

                    print("          PURCHASE DETAILS")
                    print("Pizza Type: Odogwu Size:")
                    print(f"\nTotal Boxes: {odogwu_boxes}")
                    print(f"For {customers_for_odogwu_size} person(s)\nTotal Price: #{total_price}\nLeftover Slices: {odogwu_slices_left}")
                    print("\n     Enjoy Your Pizza")
                else:
                    print("Invalid Input, please try again")

            else:
                print("Invalid input, please enter the correct option")
        except ValueError:
            print("Invalid input, please enter a valid number")

# Call the function to run the program
pizza_wahala()
