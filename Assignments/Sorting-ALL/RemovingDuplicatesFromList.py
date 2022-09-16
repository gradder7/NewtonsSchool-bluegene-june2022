my_list = list()
for i in range(5):
  my_list.append(input().strip())
print(sorted(list(set(my_list))))