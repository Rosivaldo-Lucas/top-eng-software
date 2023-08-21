const buttonF = function f(props)  {
 return (
  <div>
      <button onClick= { () => props.onClick() } > { props.label} </button>
    </div>
   );
}

export default buttonF;


