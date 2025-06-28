import tkinter

root = tkinter.Tk()

root.geometry("600x200")

# lbl=tkinter.Label(root,text="Welcome To Python")

# lbl.config(font="Verdana 20 italic")

lbl=tkinter.Label(root,text="Welcome to Python",fg="red",font=("Times New Roman", 20, "bold"))

lbl.pack()

root.mainloop()
