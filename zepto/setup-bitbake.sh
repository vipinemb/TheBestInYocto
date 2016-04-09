#pushd ~/yp/dl
#wget -c -O bitbake-1.17.0.tar.gz \
#    https://github.com/openembedded/bitbake/archive/1.17.0.tar.gz
#popd

tar -x -f ../dl/bitbake-1.17.0.tar.gz

pushd bitbake-1.17.0
python setup.py build
popd

pushd bitbake-1.17.0/build/scripts*
export PATH=$PWD:$PATH
popd

pushd bitbake-1.17.0/build/lib*
export PYTHONPATH=$PWD:$PYTHONPATH
popd

pushd bitbake-1.17.0/lib
export PYTHONPATH=$PWD:$PYTHONPATH
popd