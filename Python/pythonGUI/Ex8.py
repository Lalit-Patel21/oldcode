import tkinter

root = tkinter.Tk()

root.geometry("600x200")

lbl=tkinter.Label(root,text="Welcome To Python")

lbl.config(fg="red",bg="yellow")

lbl.pack()

root.mainloop() 
