import tkinter

root = tkinter.Tk()

root.geometry("600x200")

lbl=tkinter.Label(root,text="Welcome To Python ",bg="red", fg="blue") 

lbl.pack()

root.config(bg='yellow')
# lbl.configure(fg="red",bg="yellow")

root.mainloop()


