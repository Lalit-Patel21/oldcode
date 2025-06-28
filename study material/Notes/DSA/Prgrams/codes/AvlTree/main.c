#include <stdio.h>
#include <stdlib.h>
struct avl{
   struct avl *left;
   int data;
   int height;
   struct avl *right;
}*root=NULL;
struct stack{
struct avl * arr[10];
int tos;
};
int nodeheight(struct avl*p){
  int hl,hr;
  hl=p && p->left?p->left->height:0;
  hr=p && p->right?p->right->height:0;

  return hl>hr?hl+1:hr+1;
}
int balancefactor(struct avl*p)
{
    int hl,hr;
  hl=p && p->left?p->left->height:0;
  hr=p && p->right?p->right->height:0;

  return hl-hr;
}
struct avl* LLrotation(struct avl *p)
{
     struct avl* pl=p->left;
     struct avl*plr=pl->right;
     pl->right=p;
     p->left=plr;
     p->height=nodeheight(p);
     pl->height=nodeheight(pl);
     if(root==p)
            root=pl;
    return pl;
}
struct avl* LRrotation(struct avl *p)
{
     struct avl* pl=p->left;
     struct avl*plr=pl->right;
     pl->right=plr->left;
     p->left=plr->right;
     plr->left=pl;
     plr->right=p;
     pl->height=nodeheight(pl);
     p->height=nodeheight(p);
     plr->height=nodeheight(plr);
     if(root==p)
            root=plr;
    return plr;
}
void push(struct stack *p,struct avl *t){
    p->tos++;
    p->arr[p->tos]=t;
}
struct avl * pop(struct stack *p){
if(p->tos==-1)
    return NULL;
return p->arr[p->tos--];
}
struct avl* append(struct avl *pr,int x)
{
    struct avl *p=NULL;
    if(pr==NULL){

        p=(struct avl*)malloc(sizeof(struct avl));
        p->data=x;
        p->left=p->right=NULL;
        p->height=1;

        return p;
    }
    if(x>pr->data)
        pr->right=append(pr->right,x);
    else
        pr->left=append(pr->left,x);
    pr->height=nodeheight(pr);
    if(balancefactor(pr)==2 && balancefactor(pr->left)==1)
        return LLrotation(pr);
    else if(balancefactor(pr)==2 && balancefactor(pr->left)==-1)
        return LRrotation(pr);
    return pr;
}
void inorder(struct avl *p){
struct stack s;
s.tos=-1;
while(p!=NULL){
    while(p!=NULL){
        push(&s,p);
        p=p->left;
    }
    p=pop(&s);
    while(p!=NULL){
        printf("\n%d,%d",p->data,p->height);
        if(p->right!=NULL){
            p=p->right;
            break;
        }
        p=pop(&s);
    }

}
}
int main()
{

    root=append(root,10);
    append(root,5);
    append(root,2);
    //append(root,8);
    inorder(root);

    return 0;
}
