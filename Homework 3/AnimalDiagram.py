# Re-import required library due to execution state reset
from graphviz import Digraph

# Create a Graphviz Digraph
dot = Digraph('Class Diagram', filename='class_diagram', format='png')

# Define classes based on updated Java code
dot.node('AnimalKingdom', 'AnimalKingdom\n+ name: String\n+ age: int\n+ makeSound()\n+ displayInfo()')
dot.node('Mammal', 'Mammal\n+ hasFur: boolean\n+ makeSound()\n+ displayMammalInfo()')
dot.node('Bird', 'Bird\n+ canFly: boolean\n+ makeSound()\n+ displayBirdInfo()')
dot.node('Animal', 'Animal\n+ main()')

# Define relationships
dot.edge('AnimalKingdom', 'Mammal', label='inherits')
dot.edge('AnimalKingdom', 'Bird', label='inherits')
dot.edge('Animal', 'Mammal', label='uses')
dot.edge('Animal', 'Bird', label='uses')

# Render and display the diagram
dot_path = "/home/labboro/repos/CS6301/Homework 3/class_diagram.png"
dot.render(dot_path, format="png", cleanup=True)
dot_path
