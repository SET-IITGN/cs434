class Stack: #The set of functions  defined on a stack
   def __init__(self): 
      self.items = [] 
   def push(self, item):
      #Adds an item to the top of the stack. 
      self.items.append(item)
   def pop(self): 
      #Removes and returns the item from the top of the stack. 
      if self.is_empty(): 
         raise Exception("Stack is empty") 
      return self.items.pop() 
   def is_empty(self): 
      #Checks if the stack is empty.
      return len(self.items) == 0

# Example usage ​
my_stack = Stack() 
my_stack.push(1)
print(my_stack.pop())
print(my_stack.is_empty())
