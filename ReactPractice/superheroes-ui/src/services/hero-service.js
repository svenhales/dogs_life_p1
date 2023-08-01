import http from './axios-common';

export function getAllHeroes(){
    return http.get("/heroes");
}

const [heroes,setHeroes] = useState([]);
useEffect(()=>{
    getHeroesFromAPI();}, 
    []
);
const getHeroesFromAPI = ()=>{}

getAllHeroes()
  .then(res => {
      setHeroes(res.data);
  })
  .catch(err => {
      setHeroes([]);
      console.log(err);
  })