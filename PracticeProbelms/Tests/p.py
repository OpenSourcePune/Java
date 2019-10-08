import re

def cleanhtml(raw_html):
  cleanr = re.compile('<.*?>')
  cleantext = re.sub(cleanr, '', raw_html)
  return cleantext
mystr = ''
while (mystr!=694205):
    mystr = str(input())
    #print(cleanhtml(mystr))
    sttt = cleanhtml(mystr).split()
    sttt = " ".join(sttt)
    print(sttt)
'''
#include<stdio>
<br>
int main(){
<br>
<p>
<bakchodi>

alejklfj

</bakchodi>
<p>
}
'''
