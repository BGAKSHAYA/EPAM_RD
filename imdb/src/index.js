import React from 'react';
import ReactDOM from 'react-dom';



class Header extends React.Component {
  constructor(props) {
    super(props)
    this.state = {load: false}
    this.load = false;

  }
  buttonHandler = (filter) => {
    var fetchedTitles = []
    var fetchedImages = []
    var fetchedGenres = []
    var fetchedYears = []


    this.setState({load : true})
    
    console.log(this.search.value)
    fetch("http://react-cdp-api.herokuapp.com/movies?search="+this.search.value+"&searchBy="+filter+"&limit=500")
         .then(results => results.json())
         .then(data => {

           data["data"].map(item => fetchedTitles.push(item["title"]))
           data["data"].map(item => fetchedImages.push(item["poster_path"]))
           data["data"].map(item => fetchedGenres.push(item["genres"].join(" ")))
           data["data"].map(item => fetchedYears.push(item["release_date"]))

           this.setState({fetchedTitles: {...fetchedTitles} })
           this.setState({fetchedImages: {...fetchedImages} })
           this.setState({fetchedGenres: {...fetchedGenres} })
           this.setState({fetchedYears: {...fetchedYears} })

           this.setState({length: fetchedTitles.length })

        })
    
  }



  render() {
    const load= this.state.load;
    const length= this.state.length;
    return (
      <div>
          
          <div className="header-image">
              <div className="margining">
                    <p>netflix roulette </p><br /> <br /> <br /> <br />
                    <div id="boxes">
                        <p> FIND UR MOVIE </p> <br /> <br />
                        <input type ="text" id="movie-name" placeholder= "Enter movie" ref = {(input) => this.search = input}/> <br /><br /><p>SEARCH BY </p><br /> <br />
                        <button id = "title" onClick = {() => this.buttonHandler("title")} ref = {(Button) => this.titleButton = Button } > TITLE </button> 
                        <button id = "genre" onClick = {() => this.buttonHandler("genres")} ref = {(Button) => this.genreButton = Button } > GENRE </button>
         
                    </div>
              </div>
          </div>
          {load && typeof this.state.length != 'undefined'? <MovieNumber movieCount = {this.state.length}/> :<p></p>}
          <hr /> <div className ="imageDiv"> {length==0? <p>No Results found</p> : <ImageRendering stateVar= {this.state} /> } </div> 
       </div>
     );
  }
 
}

const MovieNumber = props => {
  return <p>{props.movieCount} movies found</p>
}


const ImageRendering = props => {
  console.log('props in fun', props)
  console.log('decision ?', typeof props.stateVar.fetchedImages)
  if(typeof props.stateVar.fetchedImages === 'undefined' || Object.keys(props.stateVar.fetchedImages).length<20) {
    console.log("returned null")
    return null;

  }
 
  const fetchedImages =  props.stateVar.fetchedImages
  const fetchedTitles =  props.stateVar.fetchedTitles
  const fetchedGenres =  props.stateVar.fetchedGenres
  const fetchedYears =props.stateVar.fetchedYears;

  console.log(fetchedImages)
  console.log(fetchedTitles)
  console.log(fetchedGenres)

  var listItems = []

  for (var index=0; index<props.stateVar.length; index++) {
    listItems.push(
    <div className="griditem">
      <img src={fetchedImages[index].toString()} key={fetchedImages[index].toString()} width={300} height={400} /><br />
      <p className="title">{fetchedTitles[index]}</p>
      <p className="year">{fetchedYears[index].toString().substr(0,4)}</p>
      <br /><p className="genre">{fetchedGenres[index]}</p>
    </div>)
  }

  console.log('listItems' ,listItems)
  return (<div className="gridcontainer">{listItems}</div>)

}

ReactDOM.render(<Header />, document.querySelector('#header'));
