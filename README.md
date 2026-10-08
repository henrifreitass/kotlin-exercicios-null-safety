# 📱 Exercícios de Kotlin: Funções, Null Safety e Controle de Fluxo

Lista de 7 exercícios práticos em **Kotlin**, baseados em situações do dia a dia de um desenvolvedor (e-commerce, apps de entrega, streaming, banco, transporte e restaurante).

O foco é praticar:

- **Funções** e **funções Lambda** (parâmetro implícito `it`)
- **Null Safety**: tipos anuláveis (`?`), Safe Call (`?.`) e Operador Elvis (`?:`)
- **Controle de fluxo**: `if/else`, `when` e laços de repetição (`for`)

---

## 📋 Questões

| # | Tema | Contexto | Conceitos |
|---|------|----------|-----------|
| 1 | Sistema de Cupons Avançado | E-commerce | `when`, Null Safety |
| 2 | Auditoria de Entregas | App de entregas | `for`, Operador Elvis, `if/else` |
| 3 | Validação de Perfil de Streaming | Perfil infantil | `if/else`, Safe Call, Elvis |
| 4 | Processamento de Transações Pix | Banco | `for`, `if/else`, listas com `null` |
| 5 | Classificação de Feedback de Motoristas | App de corrida | `when`, Elvis |
| 6 | Cálculo de Gorjeta | Restaurante | Lambda, `it`, Null Safety |
| 7 | Limpeza de Banco de Dados de Usuários | Cadastro de e-mails | `for`, múltiplas condições, Safe Call, Elvis |

---

## 📝 Descrição de cada exercício

### Questão 1: Sistema de Cupons Avançado
Função `calcularDesconto(valor: Double, cupom: String?)` que usa `when` para aplicar o desconto:
- `"PROMO10"` → valor − 10
- `"PROMO20"` → valor − 20
- `null` ou qualquer outro cupom → valor original

### Questão 2: Auditoria de Entregas
Função que recebe uma `List<String?>` de endereços e percorre com `for`. Endereços nulos são substituídos por `"Endereço Desconhecido"` com o Operador Elvis. Depois, com `if/else`, imprime:
- `"Entrega Pendente: Falta de dados"` para endereços desconhecidos
- `"Rota traçada para: [endereço]"` para endereços válidos

### Questão 3: Validação de Perfil de Streaming
Função `validarBioInfantil(bio: String?)` que descobre o tamanho do texto com Safe Call e Elvis (nulo = tamanho 0). Imprime `"Bio aceita"` se tiver até 50 caracteres e `"Bio muito longa"` caso contrário.

### Questão 4: Processamento de Transações Pix
Dada a lista `[50.0, null, 120.5, null, 10.0]`, um laço soma os valores não nulos em uma variável `total`. Transações nulas imprimem `"Transação ignorada"`. No final, imprime o total processado.

### Questão 5: Classificação de Feedback de Motoristas
Função `avaliarMotorista(nota: Int?)` que converte notas nulas em `0` com Elvis e usa `when` para imprimir:
- 5 → `"Excelente corrida!"`
- 4 → `"Boa corrida."`
- 1, 2 ou 3 → `"Precisamos melhorar."`
- 0 → `"Nenhuma avaliação fornecida."`

### Questão 6: Lambda para Cálculo de Gorjeta
Variável que armazena uma função Lambda `(Double?) -> Double`, usando o parâmetro implícito `it`. Retorna `0.0` se a gorjeta for nula ou menor que 0; caso contrário, retorna o próprio valor. Testada na `main` com valores nulos e válidos.

### Questão 7: Limpeza de Banco de Dados de Usuários
Função que recebe uma `List<String?>` de e-mails e percorre com `for`, contando as "contas inválidas" (e-mail nulo **ou** em branco, verificado com Safe Call e Elvis). Imprime um aviso de deleção para cada conta inválida, informa as contas válidas e, no final, mostra quantas contas precisam ser apagadas.

---

## 🛠️ Tecnologias

- Kotlin
- IntelliJ IDEA

---

## 👤 Autor

**Henrique**
GitHub: [@henrifreitass](https://github.com/henrifreitass)
