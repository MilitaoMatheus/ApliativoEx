# Exercício de fixação

Aplicativo criado para a realização dos exercícios instruídos em aula pela professora Aline Firmino Brito.

<br>

- Tela de entrada com as opções de qual exercício deseja:<br>
![AppInicio](https://github.com/MilitaoMatheus/EX_Pam/assets/127455174/be3a579d-6886-47ba-b130-a505398f84bf)


- Exercício 1:
Esse exercício se baseia na criação de um programa que leia dois valores A e B e escreve se são múltuplos ou não.<br>
![AppEx1](https://github.com/MilitaoMatheus/EX_Pam/assets/127455174/d28c6746-b0e5-4e28-890d-73c06a2de10b)


- Exercício 2:
Esse exercício se baseia na criação de um programa onde a pessoa escolhe a quantidade de intes que ela deseja (Cachorro quente, refrigerante e sobremesa). Ao terminar os pedidos, o programa irá calcular e apresentr o valor na tela.<br>
 ![AppEx2](https://github.com/MilitaoMatheus/EX_Pam/assets/127455174/de94d69c-9443-4b81-b4bb-487b3bfea5e0)


<br>
<br>

# Codigos java
<br>

### Tela de escolha de exeercicios <br>

![Codlog](https://github.com/MilitaoMatheus/ApliativoEx/assets/127455174/1152de3d-2a34-4f58-8356-3ac54d0276f2)
![Codlog2](https://github.com/MilitaoMatheus/ApliativoEx/assets/127455174/065bcd04-ea10-41c1-af60-b42d63f06467)
<br>
Nesse código temos duas funções que levam para telas de exercícios diferentes
<br>

### Código Exercício 1

![CodEx1pt1](https://github.com/MilitaoMatheus/ApliativoEx/assets/127455174/9236a70b-382b-477d-8e02-bbc666d6ad59)
<br>
Na primeira parte podemos ver um declarção de elemntos presentes naquela tela, além desses elemtos,
variáveis também estão sendo declaradas. "Num1" e "Num2" são o campo de digito dos valores;
"btncalcula" e "btnVoltar" são as funções presentes na aplicação; e o "resultado" será 
onde o resultado será exibido. 
<br>
![CodEx1pt2](https://github.com/MilitaoMatheus/ApliativoEx/assets/127455174/fda866ea-860a-47a4-af39-e6772920a16f)
<br>
Na segunda parte nós temos um evento (btncalcula) que receberá uma ação. 
Dentro do "@Override" podemos ver o "n1" e "n2" que serão as variáveis utilizadas para
a conta. Logo após vemos a conta, que verá se a condição é verdadeira ou falsa e apreentará o
resultado mais adequado.
Por fim vemos um método de voltar para a tela inicial, método esse que será aplicado ao btnVoltar.
<br>

### Código exercício 6

![CodEx6pt1](https://github.com/MilitaoMatheus/ApliativoEx/assets/127455174/4217884d-a257-4db5-a914-ae1c6835b9d0)
<br>
Na primeira parte podemos ver um declarção de elemntos presentes naquela tela, além desses elemtos,
variáveis também estão sendo declaradas.
<br>
![CodEx6pt2](https://github.com/MilitaoMatheus/ApliativoEx/assets/127455174/f382eb0d-77f1-43a8-bc6d-82331ee7b6e7)
<br>
Podemos ver a continuação da declaração de variáveis. Onde "c", "r" e "s", citados a imagem acima, 
receberão valores pré definidos que serão utilizados futuramente.
A parte de "BtnCalcula" é o método que mostrara o valor.
A parte que se trata do método "Calcular" recebe a conta ttoda do código. 
Conta = ("valor de c" * quantidade de produto c) + ("valor de r" * quantidade de produto r) + ("valor de s" * quantidade de produto s)
e o valor será retornado em "result".
Por fim vemos um método de voltar para a tela inicial, método esse que será aplicado ao btnVoltar.

<br>
<br>

# Passo a passo de como mandar pro git
- #### git init <br>
 ![cod1](https://github.com/MilitaoMatheus/ApliativoEx/assets/127455174/86fa4230-aab6-4607-95e9-ad0f5cf6ef2a)
  
```
O git init inicializa um novo repositório no git em um diretório vazio ou em um projeto já começado 
```

<br>
  
- ### git status <br>
 ![cod2](https://github.com/MilitaoMatheus/ApliativoEx/assets/127455174/ba7dda37-0678-4bda-85fa-58bae1ee1c6c)


```
O git status exibe os arquivos presentes no repositório (os adciondos e os não adcionados)
```

<br>

- ### git add . <br>
![cod3](https://github.com/MilitaoMatheus/ApliativoEx/assets/127455174/43779a57-9826-433f-8e1b-161c88dbb757)

```
O git add . adciona o que foi alterado ou não adcionado 
```

<br>

- ### git status <br>
  ![cod4](https://github.com/MilitaoMatheus/ApliativoEx/assets/127455174/bade21ac-6566-4084-93ee-31d30d752a8a)

```
Continua com o mesmo sentido, e nesse caso ele foi utilizado para ver o que foi adcionado
```

- ### git commit -a -m <br>
![cod5](https://github.com/MilitaoMatheus/ApliativoEx/assets/127455174/aeecd7e5-b0f1-41f6-b62b-ad69b23df174)

```
O git commit deixa os arquivos prontos para o envio. O -a deixa os arquivos preparados para envio e o -m permite escrever uma
mensagem indicando o qué aquele commit
```
   
<br>
  
- ### git remote add origin <br>
  ![cod6](https://github.com/MilitaoMatheus/ApliativoEx/assets/127455174/03741653-6d7c-4271-bd0d-729f3b7653b5)

```
O git remote add origin https://github/user_name/repositorio_name é usado como o caminho para qual repositório o diretório irá
```

<br>

- ### git branch -M main <br>
![cod7](https://github.com/MilitaoMatheus/ApliativoEx/assets/127455174/abb55373-7e65-4e17-849f-c4e1e475cd6e)

```
É utilizado para renomear a branch padrão do git
```

<br>


- ### git push -u origin main <br>
![cod8](https://github.com/MilitaoMatheus/ApliativoEx/assets/127455174/8a6c76bf-8f49-494b-a06f-14db194cfc9e)

```
É utilizado para enviar as alterações feitas para o repositório
```

## LINK DO VÍDEO 
https://youtube.com/shorts/S-7uz6vbe0s?si=_jBMZDGU0D5wPXpK
