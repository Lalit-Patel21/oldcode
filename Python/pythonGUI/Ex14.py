import tkinter

import tkinter.font as tkFont

root = tkinter.Tk()

root.geometry("600x200")

myfont=tkFont.Font(size=22)

lbl=tkinter.Label(root,text="Welcome To Python",font=myfont,bg="red",width=30)

lbl.pack()

root.mainloop() 
