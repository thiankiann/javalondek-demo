Git - good practices

* commit powinien mieć dobry opis
* commit powinien zawierać jedną zmianę
* zmiana opisu tylko dla ostatniego commita (amend)
* podróżuj po historii i branchach tylko przy czystym drzewie roboczym
* git flow - w skrócie
    * master - branch release'owy
    * develop - branch developerski
    * feature branch - branch do rozwoju funkcjonalności
    * feature branch - powinien startować od developa i do niego finalnie zostać zmergowany
* branch
    * własny branch nie musi być idealny (może nie działać, może zawierać komentarze FIXME/TODO),
      ale wysłanie merge requesta z tego brancha musi zawierać "piękny kod"
    * usuwanie branch'y
        * zmergowany branch można usunąć
        * nie powinniśmy usuwać nie zmergowanych branch'y bo nie będziemy w stanie wrócić do nich
        * nie usuwamy branch'a na którym aktualnie się znajdujemy:)
    * mergowanie
        * fast forward nie zawsze jest możliwy - działa tylko w przypadku gdy jeden branch może "dogonić" drugi
        * zawsze można wymusić commit mergujący

Git - przydatne komendy
git status
git add .
git add file-name
git add file-name1 file-name2
git commit -m "[tag] - message"
git restore --staged file-name // zdejmij ze stage'a
git checkout branch-name // przełącz się na branch-name
git checkout -b branch-name // przełącz na nowo utworzony branch
git log --graph // rysuje graf historii w konsoli
