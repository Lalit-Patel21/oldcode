import tkinter
tw = tkinter.Tk()
screenwidth=tw.winfo_screenwidth()
screenheight=tw.winfo_screenheight()
width=screenwidth//2
height=screenheight//2
xco=screenwidth//4
yco=screenheight//4
tw.geometry(f"{width}x{height}+{xco}+{yco}")
tw.resizable(True,True) 
tw.mainloop()
