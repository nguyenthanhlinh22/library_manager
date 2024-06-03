function resetCardSelected() {
    this.selectedCards = [];
}

function upCoin() {
    this.coin += 100;
}

function isWin() {
    return this.matchedPairs === this.totalPairs;
}

class MemoryGame {
    constructor(images) {
        this.cardsContainer = document.getElementById('cards');
        this.resetButton = document.getElementById('reset');
        this.images = images;
        this.totalPairs = images.length;
        this.selectedCards = [];
        this.matchedPairs = 0;
        this.coin = 0;
    }

    createCards() {
        let doubledImages = this.getDoubledImages();
        doubledImages = MemoryGame.getSort(doubledImages);
        this.showImages(doubledImages);
    }

    showImages(doubledImages) {
        doubledImages.forEach(image => {
            const card = document.createElement('div');
            card.classList.add('card');
            card.style.backgroundImage = `url(${image})`;
            card.addEventListener('click', () => this.flipCard(card));
            this.cardsContainer.appendChild(card);
        });
    }

    static getSort(doubledImages) {
        return doubledImages.sort(() => Math.random() - 0.5);
    }

    getDoubledImages() {
        return this.images.concat(this.images);
    }

    flipCard(card) {
        // khong hieu y nghia cua doan bieu thuc if
        if (this.selectedCards.length < 2 && !this.selectedCards.includes(card)) {
            card.classList.add('flipped');
            this.selectedCards.push(card);
            if (this.checkCardForDuplicate()) {
                setTimeout(() => this.checkForMatch(), 500);
            }
        }
    }

    checkCardForDuplicate() {
        // khong hieu gia tri 2 la gi?
        return this.selectedCards.length === 2;
    }

    resetGame() {
        this.resetButton.addEventListener('click', () => {
            location.reload();
        });
    }


    checkForMatch() {
        const [firstCard, secondCard] = this.selectedCards;
        const isMatch = firstCard.style.backgroundImage === secondCard.style.backgroundImage;

        if (isMatch) {
            resetCardSelected.call(this);
            this.matchedPairs++;
            upCoin.call(this);
            this.showScore();
            if (isWin.call(this)) {
                alert('Congratulations! You won!');
            }
        } else {
            setTimeout(() => {
                firstCard.classList.remove('flipped');
                secondCard.classList.remove('flipped');
                resetCardSelected.call(this);
            }, 10);
            if (this.coin > 0) {
                this.coin -= 50;
            }
            this.showScore();
        }
    }

    showScore() {
        document.getElementById('score1').innerHTML = this.coin;
    }
}

const images = [
    'public/image/1.jpg',
    'public/image/2.jpg',
    'public/image/3.jpg',
    'public/image/4.jpg',
    'public/image/6.jpg',
    'public/image/7.jpg',
    'public/image/8.jpg',
    'public/image/9.jpg',
    'public/image/10.jpg',
    'public/image/11.jpg',
    'public/image/12.jpg',
    'public/image/13.jpg',
    'public/image/14.jpg',
    'public/image/15.jpg',
    'public/image/16.jpg',
    'public/image/17.jpg',
    'public/image/18.jpg',
    'public/image/19.jpg',
    'public/image/20.jpg',
    'public/image/21.jpg',
    'public/image/22.jpg',

];
const game = new MemoryGame(images);
game.createCards();
  