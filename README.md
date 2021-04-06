# CYK-Algorithm

Producer : Thapanut Saripat, Trisinchai Kamjamnong, Piyabute Chairiboon, Sirapop Promrit, Kanittee Rodpuek

#Made when 25/03/2021
![Home](https://user-images.githubusercontent.com/78923610/112649714-3f5c4580-8e7d-11eb-8eed-2c5108d4a15f.PNG)

Example Rule

Rule: 1 "Case that can be used"
S -> AB | BC
A -> BA | a
B -> CC | b
C -> AB | a

Rule: 2 "Case that can be used"
S -> AB | CB
A -> BA | a
B -> BC | b
C -> AC | a

Rule: 4 "Case that can be used"
S -> AB
A -> CD | CF
B -> c | EB
C -> a
D -> b
E -> c
F -> AD

Rule: 6 "Case that can be used"
S -> AT | AB
T -> SB
A -> a
B -> AC | a | c
C -> c

Rule: 7 "Case that can be used"
S -> AB | BB
A -> CC | AB | a
B -> BB | CA | b
C -> BA | AA | b

Rule: 8 "Case that can't be used"
S -> AB 
A -> BB | 0
B -> AA | 1

Rule: 9 "Case that can be used"
S -> TA | BA | AB | b
A -> AC | a
T -> AB
B -> b
C -> c

Rule: 10 "Case that can be used"
S -> AB | SS | a
A -> BS | CD | b
B -> DD | b
C -> DE | a | b
D -> a
E ->  SS

Rule: 11 "Case that can be used"
S -> AB
A -> CC | a | c
B -> BC | b
C -> CB | BA | c

Rule: 12 "Case that can be used"
S -> CB | AA | BD
A -> AC | BB | a
B -> BC | DA | b
C -> CB | c
D -> d

Rule: 13 "Case that can be used"
S -> AB
A -> BB | a
B -> AB | b


Rule: 14 "Case that can be used"
S -> AB
S -> BA
A -> CC | a | c
B -> BC | b
C -> CB | BA | c


Rule: 15 "Case that can't be used"
BB -> AB
A -> CD | CF
B -> c | EB
C -> a
D -> b
E -> c
F -> AD

Rule: 16 "Case that can't be used"
G_5 -> AB
A -> CD | @@
B -> c | b
C -> a
D -> b
E -> c
F -> AD

Rule: 17 "Case that can't be used"
G N -> AB
A -> CD
B -> c | b
C -> a
D -> b
E -> c
F -> AD

Rule: 18 "Case that can't be used"
 -> AB
A -> CD
B -> c | b
C -> a
D -> b
E -> c
F -> AD

Rule: 19 "Case that can't be used"
- -> AB
A -> CD
B -> c | b
C -> a
D -> b
E -> c
F -> AD

Rule: 20 "Case that can't be used"
S -> AB
A -> CD
B -> c | b
C -> a
D -> -
E -> c
F -> AD
