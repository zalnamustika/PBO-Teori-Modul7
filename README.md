# PBO-Teori-Modul7

## Latihan 1 

Pada latihan ini membuat program yang menampilkan hari dalam seminggu yang mana menggunakan metode while-loop dan for-loop. berikut algoritma dari program ini :

KAMUS :

i : integer

day : array of String [0...day.length]

ALGORITMA 

while (i < 7) do

output(day[i])

i <- i+1

end while

END ALGORITMA


## Latihan 2

Pada latihan ini membuat sebuah program yang mana user akan mengimputkan beberapa nomor yang mana disini menggunakankan array untuk menyimpan nomor - nomor tersebut lalu menampilkan nomor terbesar berdasarkan nomor - nomor yang telah diinputkan oleh user tersebut.

KAMUS :

batas, i, max : integer

arr : array [0...batas] of integer 

ALGORITMA 

input (batas)

for i to batas+1 do 

  input (arr[i])
  
end for i

max <- arr[0]

for i to batas+1 do 

  max <- arr[i]
  
end for i

output (max)

END ALGORITMA

## Latihan 3

Pada Latihan ini membuat program cetak buku alamat dari sebuah array multidimensi yang menyatakan isi dari sebuah buku alamat. berikut algoritma :

KAMUS :

i : integer

entry : array [0...day.length,0...day.length] of integer 

ALGORITMA

i <- 0

do then

output (entry[i][0])

output (entry[i][1])

output (entry[i][2])

while(i<3)

END WHILE

END ALGORITMA








