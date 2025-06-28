import tkinter

import tkinter.font as tkFont

root = tkinter.Tk()

root.geometry("600x200")

myfont=tkFont.Font(weight="bold")

lbl=tkinter.Label(root,text="Welcome To Python",font=myfont)

lbl.pack()

root.mainloop()
